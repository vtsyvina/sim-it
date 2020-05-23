package sim.grammar;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import sim.algorithm.ReversePolishNotation;
import sim.algorithm.ReversePolishNotation.Tok;
import sim.antlr.SIMITBaseListener;
import sim.antlr.SIMITLexer;
import sim.antlr.SIMITParser;
import sim.core.model.Context;
import sim.core.model.Environment;
import sim.core.model.Population;
import sim.core.rule.BlockRule;
import sim.core.rule.Rule;
import sim.core.rule.RuleExecutor;
import sim.core.rule.Rules;
import sim.core.simulation.Simulation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;

import static sim.algorithm.ReversePolishNotation.TokType.COMMA;
import static sim.algorithm.ReversePolishNotation.TokType.CP;
import static sim.algorithm.ReversePolishNotation.TokType.FUN;
import static sim.algorithm.ReversePolishNotation.TokType.ID;
import static sim.algorithm.ReversePolishNotation.TokType.OP;
import static sim.algorithm.ReversePolishNotation.TokType.OPERATION;

public class SimItGrammarParser extends SIMITBaseListener {
    private CommonTokenStream commonTokenStream;
    private Vocabulary vocabulary;

    private Simulation simulation;
    private Environment environment;
    private Population population;
    private List<String> envVariables = new ArrayList<>();
    private List<Double> envValues = new ArrayList<>();

    private List<String> popVariables = new ArrayList<>();
    private List<Double> popValues = new ArrayList<>();
    List<Rule> rules = new ArrayList<>();
    int iterations;
    public int calcNumber = 0;
    public int calcBool = 0;
    private int saveEach = 1;

    private ReversePolishNotation RPN;

    public Simulation parseToSimulation(String test) {
        return parseToSimulation(test, 10_000);
    }

    public Simulation parseToSimulation(String test, int saveEach) {
        this.saveEach = saveEach;
        CodePointCharStream inputStream = CharStreams.fromString(test);
        SIMITLexer simitLexer = new SIMITLexer(inputStream);
        commonTokenStream = new CommonTokenStream(simitLexer);
        SIMITParser parser = new SIMITParser(commonTokenStream);
        vocabulary = parser.getVocabulary();

        SIMITParser.MainblockContext mainblock = parser.mainblock();
        SIMITParser.InitPopContext initPopContext = mainblock.initPop();
        // if user didn't add init population block then 0 population
        if (initPopContext == null) {
            initPop(0);
        }
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
        rules.add(blockRule(ctx.rules()));
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
        environment = new Environment(envVariables, envValues.stream().mapToDouble(e -> e).toArray(), iterations, saveEach);
        System.out.println("Exit init env");
    }


    @Override
    public void enterInitEnvVar(SIMITParser.InitEnvVarContext ctx) {
        super.enterInitEnvVar(ctx);
        System.out.println("Init env identifier " + ctx.IDENTIFIER().getSymbol().getText());
        System.out.println("Init value " + ctx.NUMBER().getSymbol().getText());
        envVariables.add(ctx.IDENTIFIER().getSymbol().getText());
        double value = Double.parseDouble(ctx.NUMBER().getSymbol().getText());
        envValues.add(ctx.MINUS() == null ? value : -value);
    }

    @Override
    public void enterInitPopVar(SIMITParser.InitPopVarContext ctx) {
        super.enterInitPopVar(ctx);
        System.out.println("Init pop identifier " + ctx.IDENTIFIER().getSymbol().getText());
        System.out.println("Init value " + ctx.NUMBER().getSymbol().getText());
        popVariables.add(ctx.IDENTIFIER().getSymbol().getText());
        popValues.add(Double.parseDouble(ctx.NUMBER().getSymbol().getText()));
    }

    @Override
    //TODO adjust for complex init values
    public void exitInitPop(SIMITParser.InitPopContext ctx) {
        super.exitInitPop(ctx);
        int populationSize = Integer.parseInt(ctx.popSize().NUMBER().getText());
        initPop(populationSize);
    }

    private void initPop(int populationSize) {
        double[][] initPopValues = new double[populationSize][popVariables.size()];
        for (int i = 0; i < populationSize; i++) {
            for (int j = 0; j < popVariables.size(); j++) {
                initPopValues[i][j] = popValues.get(j);
            }
        }
        population = new Population(populationSize, popVariables, initPopValues, iterations, saveEach);
        if (populationSize == 0) {
            RPN = new ReversePolishNotation(new HashSet<>());
        } else {
            RPN = new ReversePolishNotation(population.getIndividual(0).getNamesMap().keySet());
        }

    }

    @Override
    public void enterRules(SIMITParser.RulesContext ctx) {
        super.enterRules(ctx);

        System.out.println("EnterRules");
    }


    public Rule assignment(SIMITParser.AssignmentContext ctx) {
        // if we assign individual
        if (ctx.IDENTIFIER() == null) {
            SIMITParser.Individual_varContext individual_varContext = ctx.individual_var();
            return calculatePopulationNumberExpression(individual_varContext, ctx.number_expression());
        }
        String identifier = ctx.IDENTIFIER().getSymbol().getText();
        return Rules.assignment(environment.getVariableIndex(identifier), calculateNumberExpression(ctx.number_expression()));
    }

    public Rule ifRule(SIMITParser.If_ruleContext ctx) {
        SIMITParser.Boolean_expressionContext boolean_expressionContext = ctx.boolean_expression();
        if (ctx.ELSE() == null) {
            return Rules.if_(booleanExpression(boolean_expressionContext), blockRule(ctx.rules(0)));
        } else {
            return Rules.if_(booleanExpression(boolean_expressionContext), blockRule(ctx.rules(0)), blockRule(ctx.rules(1)));
        }
    }


    private Function<Context, Double> calculateNumberExpression(SIMITParser.Number_expressionContext ctx) {
        calcNumber++;
        Interval sourceInterval = ctx.getSourceInterval();
        List<Tok> tokens = convertToTok(commonTokenStream.get(sourceInterval.a, sourceInterval.b));
        List<Tok> toks = RPN.reversePolishNotation(tokens);
        return (c) -> RPN.calculatePolishNumber(toks, c);
    }

    private Rule calculatePopulationNumberExpression(SIMITParser.Individual_varContext varContext, SIMITParser.Number_expressionContext ctx) {
        calcNumber++;
        Interval varSourceInterval = varContext.number_expression().getSourceInterval();
        List<Tok> varTokens = convertToTok(commonTokenStream.get(varSourceInterval.a, varSourceInterval.b));
        List<Tok> varToks = RPN.reversePolishNotation(varTokens);
        Interval sourceInterval = ctx.getSourceInterval();
        List<Tok> tokens = convertToTok(commonTokenStream.get(sourceInterval.a, sourceInterval.b));
        List<Tok> toks = RPN.reversePolishNotation(tokens);
        boolean hasIInLeft = varTokens.stream().anyMatch(t -> "i".equals(t.name));
        //no need to loop, just a single individual
        if (!hasIInLeft) {
            return Rules.assignment(population.getIndividual(0).getVariableIndex(varContext.IDENTIFIER().getText()),
                    (c) -> (int) RPN.calculatePolishNumber(varToks, c),
                    (c) -> RPN.calculatePolishNumber(toks, c));
        }
        int populationSize = population.size();
        int varIndex = population.getIndividual(0).getVariableIndex(varContext.IDENTIFIER().getText());
        return Rules.rule((c) -> {
            // for each i calculate the index and calculate the value and set it for individual
            for (int i = 0; i < populationSize; i++) {
                int index = (int) RPN.calculatePolishNumber(varToks, c, i);
                double value = RPN.calculatePolishNumber(toks, c, i);
                c.getPopulation().getIndividual(index).set(varIndex, value);
            }
        });
    }

    private Function<Context, Boolean> booleanExpression(SIMITParser.Boolean_expressionContext ctx) {
        calcBool++;
        Interval sourceInterval = ctx.getSourceInterval();
        List<Tok> tokens = convertToTok(commonTokenStream.get(sourceInterval.a, sourceInterval.b));
        List<Tok> toks = RPN.reversePolishNotation(tokens);
        return (c) -> RPN.calculatePolishBoolean(toks, c);
    }

    private BlockRule blockRule(SIMITParser.RulesContext ctx) {
        List<SIMITParser.RuContext> rules = ctx.ru();
        List<Rule> r = new ArrayList<>();
        for (SIMITParser.RuContext rule : rules) {
            if (rule.assignment() != null) {
                r.add(assignment(rule.assignment()));
            }
            if (rule.if_rule() != null) {
                r.add(ifRule(rule.if_rule()));
            }
        }
        return new BlockRule(r);
    }

    /**
     * Converts tokens from ANTLR to Toks - class more suitable to calculate using polish notation
     *
     * @param tokens input list of tokens from ANTLR
     * @return converted list of Toks
     */
    private List<ReversePolishNotation.Tok> convertToTok(List<Token> tokens) {
        List<ReversePolishNotation.Tok> result = new ArrayList<>();
        for (Token token : tokens) {
            if (isOP(token)) {
                result.add(new Tok(OP, "("));
            }
            if (isCP(token)) {
                result.add(new Tok(CP, ")"));
            }
            if (isComma(token)) {
                result.add(new Tok(COMMA, ","));
            }
            if (isFunction(token)) {
                result.add(new Tok(FUN, token.getText()));
                continue; // some identifiers are functions
            }
            if (isBinaryOperation(token)) {
                result.add(new Tok(OPERATION, token.getText()));
            }
            if ("NUMBER".equals(vocabulary.getSymbolicName(token.getType()))) {
                result.add(new Tok(Double.parseDouble(token.getText())));
            }
            if ("IDENTIFIER".equals(vocabulary.getSymbolicName(token.getType()))) {
                result.add(new Tok(ID, token.getText()));
            }
            if ("BOOL".equals(vocabulary.getSymbolicName(token.getType()))) {
                result.add(new Tok(token.getText().equals("true")));
            }
        }
        return result;
    }

    private boolean isFunction(Token token) {
        String symbolicName = vocabulary.getSymbolicName(token.getType());
        //if identifier is a population variable then we need to treat it like a function because of the index
        if ("IDENTIFIER".equals(symbolicName) && popVariables.contains(token.getText())) {
            return true;
        }
        return "'rand'".equals(vocabulary.getLiteralName(token.getType()))
                || "'max'".equals(vocabulary.getLiteralName(token.getType()))
                || "'min'".equals(vocabulary.getLiteralName(token.getType()))
                || "'!'".equals(vocabulary.getLiteralName(token.getType()));
    }

    private boolean isBinaryOperation(Token token) {
        if (vocabulary.getLiteralName(token.getType()) == null) {
            return false;
        }
        return switch (vocabulary.getLiteralName(token.getType())) {
            case "'^'", "'*'", "'/'", "'%'", "'+'", "'-'", "'=='", "'<'", "'>'", "'>='", "'<='", "'&&'", "'||'", "'!='" -> true;
            default -> false;
        };
    }

    private boolean isOP(Token token) {
        return "OP".equals(vocabulary.getSymbolicName(token.getType()))
                || "OB".equals(vocabulary.getSymbolicName(token.getType()));
    }

    private boolean isCP(Token token) {
        return "CP".equals(vocabulary.getSymbolicName(token.getType()))
                || "CB".equals(vocabulary.getSymbolicName(token.getType()));
    }

    private boolean isComma(Token token) {
        return "','".equals(vocabulary.getLiteralName(token.getType()));
    }


}
