package sim.grammar;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import sim.antlr.SIMITBaseListener;
import sim.antlr.SIMITLexer;
import sim.antlr.SIMITParser;
import sim.core.model.Context;
import sim.core.model.Environment;
import sim.core.model.Population;
import sim.core.rule.Rule;
import sim.core.rule.RuleExecutor;
import sim.core.rule.Rules;
import sim.core.simulation.Simulation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SimItGrammarParser extends SIMITBaseListener {
    SIMITParser parser;

    private Simulation simulation;
    private Context context;
    private Environment environment;
    private Population population;
    private List<String> envVariables = new ArrayList<>();
    private List<Double> envValues = new ArrayList<>();

    private List<String> popVariables = new ArrayList<>();
    private List<Double> popValues = new ArrayList<>();
    List<Rule> rules = new ArrayList<>();
    int iterations;


    public Simulation parseToSimulation(String test) {

        CodePointCharStream inputStream = CharStreams.fromString(test);
        SIMITLexer simitLexer = new SIMITLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(simitLexer);
        parser = new SIMITParser(commonTokenStream);
        SIMITParser.MainblockContext mainblock = parser.mainblock();
        ParseTreeWalker walker = new ParseTreeWalker();
        mainblock.enterRule(this);
        walker.walk(this, mainblock);
        System.out.println();
        return simulation;
    }

    @Override
    public void enterMainblock(SIMITParser.MainblockContext ctx) {
        super.enterMainblock(ctx);


//        if (number == null){
//            throw new GrammarParseException("No population size prodided");
//        }
        System.out.println("Pop");
    }

    @Override
    public void exitMainblock(SIMITParser.MainblockContext ctx) {
        super.exitMainblock(ctx);
                List<SIMITParser.RuContext> ru = ctx.rules().ru();
        for (SIMITParser.RuContext rule : ru) {
            if(rule.assignment() != null){
                rules.add(assignment(rule.assignment()));
            }
            if(rule.if_rule() != null){

            }
        }
        simulation = new Simulation(new Context(environment, population), new RuleExecutor(rules), iterations);
    }

    @Override
    public void enterInitEnv(SIMITParser.InitEnvContext ctx) {
        super.enterInitEnv(ctx);
        System.out.println("Enter init env");
    }

    @Override
    public void enterInitIterations(SIMITParser.InitIterationsContext ctx) {
        super.enterInitIterations(ctx);
        iterations = Integer.parseInt(ctx.NUMBER().getText());
        System.out.println("Enter init iterations");
    }

    @Override
    public void exitInitEnv(SIMITParser.InitEnvContext ctx) {
        super.exitInitEnv(ctx);
        environment = new Environment(envVariables, envValues.stream().mapToDouble(e -> e).toArray(), iterations);
        System.out.println("Exit init env");
    }



    @Override
    public void enterInitEnvVar(SIMITParser.InitEnvVarContext ctx) {
        super.enterInitEnvVar(ctx);
        System.out.println("Init env identifier "+ctx.IDENTIFIER().getSymbol().getText());
        System.out.println("Init value "+ctx.NUMBER().getSymbol().getText());
        envVariables.add(ctx.IDENTIFIER().getSymbol().getText());
        double value = Double.parseDouble(ctx.NUMBER().getSymbol().getText());
        envValues.add(ctx.MINUS() == null ? value : -value );
    }

    @Override
    public void enterInitPopVar(SIMITParser.InitPopVarContext ctx) {
        super.enterInitPopVar(ctx);
        System.out.println("Init pop identifier "+ctx.IDENTIFIER().getSymbol().getText());
        System.out.println("Init value "+ctx.NUMBER().getSymbol().getText());
        popVariables.add(ctx.IDENTIFIER().getSymbol().getText());
        popValues.add(Double.parseDouble(ctx.NUMBER().getSymbol().getText()));
    }

    @Override
    //TODO adjust for complex init values
    public void exitInitPop(SIMITParser.InitPopContext ctx) {
        super.exitInitPop(ctx);
        int populationSize = Integer.parseInt(ctx.popSize().NUMBER().getText());
        double[][] initPopValues = new double[populationSize][popVariables.size()];
        for (int i = 0; i < populationSize; i++) {
            for (int j = 0; j < popVariables.size(); j++) {
                initPopValues[i][j] = popValues.get(j);
            }
        }
        population = new Population(populationSize, popVariables, initPopValues, iterations);
    }

    @Override
    public void enterRules(SIMITParser.RulesContext ctx) {
        super.enterRules(ctx);

        System.out.println("EnterRules");
    }


    public Rule assignment(SIMITParser.AssignmentContext ctx) {
        String identifier = ctx.IDENTIFIER().getSymbol().getText();
        return Rules.assignment(environment.getVariableIndex(identifier), calculateNumberExpression(ctx.number_expression()));
    }

    public Rule ifRule(SIMITParser.If_ruleContext ctx){
        SIMITParser.Boolean_expressionContext boolean_expressionContext = ctx.boolean_expression();
        return null;
    }

    public Function<Context, Boolean> booleanExpression(SIMITParser.Boolean_expressionContext ctx){
        return null;
    }

    @Override
    public void enterBoolean_expression(SIMITParser.Boolean_expressionContext ctx) {
        super.enterBoolean_expression(ctx);
        System.out.println("Bool exp");
    }

    private Function<Context, Double> calculateNumberExpression(SIMITParser.Number_expressionContext ctx){
            if (ctx.IDENTIFIER() != null){
                String varName = ctx.IDENTIFIER().getSymbol().getText();
                int variableIndex = environment.getVariableIndex(varName);
                return (c) -> c.getEnvironment().get(variableIndex);
            }
            if (ctx.NUMBER() != null){

                double number = (ctx.MINUS() == null ? 1: -1)*Double.parseDouble(ctx.NUMBER().getSymbol().getText());

                return (c) -> number;
            }
            if (ctx.operation() != null){
                 switch(ctx.operation().getText()){
                     case "+": return (c) -> calculateNumberExpression(ctx.number_expression(0)).apply(c) + calculateNumberExpression(ctx.number_expression(1)).apply(c);
                     case "-": return (c) -> calculateNumberExpression(ctx.number_expression(0)).apply(c) - calculateNumberExpression(ctx.number_expression(1)).apply(c);
                     case "*": return (c) -> calculateNumberExpression(ctx.number_expression(0)).apply(c) * calculateNumberExpression(ctx.number_expression(1)).apply(c);
                     case "/": return (c) -> calculateNumberExpression(ctx.number_expression(0)).apply(c) / calculateNumberExpression(ctx.number_expression(1)).apply(c);
                     case "^": return (c) -> Math.pow(calculateNumberExpression(ctx.number_expression(0)).apply(c), calculateNumberExpression(ctx.number_expression(1)).apply(c));
                     default: return (c) -> 0.;
                 }
            }
            if (ctx.OP() != null){
                return (c) -> calculateNumberExpression(ctx.number_expression(0)).apply(c);
            }
             return (c)->0.;
    }

}
