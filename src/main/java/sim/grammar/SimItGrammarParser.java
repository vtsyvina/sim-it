package sim.grammar;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
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
import java.util.List;
import java.util.Random;
import java.util.Stack;
import java.util.function.Function;

public class SimItGrammarParser extends SIMITBaseListener {
    private SIMITParser parser;
    private CommonTokenStream commonTokenStream;
    private Vocabulary vocabulary;

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
    public int calcNumber = 0;
    public int calcBool = 0;
    private Random rand = new Random();


    public Simulation parseToSimulation(String test) {

        CodePointCharStream inputStream = CharStreams.fromString(test);
        SIMITLexer simitLexer = new SIMITLexer(inputStream);
        commonTokenStream = new CommonTokenStream(simitLexer);
        parser = new SIMITParser(commonTokenStream);
        vocabulary = parser.getVocabulary();
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
        environment = new Environment(envVariables, envValues.stream().mapToDouble(e -> e).toArray(), iterations);
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
        List<Tok> tokens = reversePolishNotation(ctx);
        return (c) -> calculatePolish(tokens, c);
    }

    //TODO adjust for priorities
    private Function<Context, Boolean> booleanExpression(SIMITParser.Boolean_expressionContext ctx) {
        calcBool++;
        if (ctx.BOOL() != null) {
            boolean value = ctx.BOOL().getSymbol().getText().equals("true");
            return (c) -> value;
        }

        if (ctx.NOT() != null) {
            return (c) -> !booleanExpression(ctx.boolean_expression(0)).apply(c);
        }
        if (ctx.OP() != null) {
            return booleanExpression(ctx.boolean_expression(0));
        }
        if (ctx.logical_operation() != null) {
            Function<Context, Boolean> right = booleanExpression(ctx.boolean_expression(1));
            Function<Context, Boolean> left = booleanExpression(ctx.boolean_expression(0));
            switch (ctx.logical_operation().getText()) {
                case "==":
                    return (c) -> left.apply(c) == right.apply(c);
                case "&&":
                    return (c) -> left.apply(c) && right.apply(c);
                case "||":
                    return (c) -> left.apply(c) || right.apply(c);
                case "!=":
                    return (c) -> left.apply(c) != right.apply(c);
            }
        }
        if (ctx.number_comparison() != null) {
            Function<Context, Double> leftNumberExpression = calculateNumberExpression(ctx.number_expression(0));
            Function<Context, Double> rightNumberExpression = calculateNumberExpression(ctx.number_expression(1));
            switch (ctx.number_comparison().getText()) {
                case ">":
                    return (c) -> leftNumberExpression.apply(c) > rightNumberExpression.apply(c);
                case "<":
                    return (c) -> leftNumberExpression.apply(c) < rightNumberExpression.apply(c);
                case ">=":
                    return (c) -> leftNumberExpression.apply(c) >= rightNumberExpression.apply(c);
                case "<=":
                    return (c) -> leftNumberExpression.apply(c) <= rightNumberExpression.apply(c);
                case "==":
                    return (c) -> 1e-10 > Math.abs(leftNumberExpression.apply(c) - rightNumberExpression.apply(c));
            }
        }
        return (c) -> false;
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
     * Binary priority:
     * ^
     * *
     * /
     * +
     * -
     * TODO adjust for functions where only OP is assumed for now
     *
     * @param ctx
     * @return
     */
    private List<Tok> reversePolishNotation(SIMITParser.Number_expressionContext ctx) {
        List<Tok> result = new ArrayList<>();
        Interval sourceInterval = ctx.getSourceInterval();
        List<Token> tokens = commonTokenStream.get(sourceInterval.a, sourceInterval.b);
        Stack<Token> stack = new Stack<>();
        //https://en.wikipedia.org/wiki/Shunting-yard_algorithm
        // with small adjustment for expressions in functions. Wiki example works only for constants as arguments
        for (Token token : tokens) {
            // if postfix function (like !) or number/identificator then add to result
            if ("NUMBER".equals(vocabulary.getSymbolicName(token.getType()))) {
                result.add(new Tok(TokType.NUM, null, Double.parseDouble(token.getText())));
                continue;
            }
            if ("IDENTIFIER".equals(vocabulary.getSymbolicName(token.getType()))) {
                result.add(new Tok(TokType.ID, token.getText(), 0));
                continue;
            }
            if (isFunction(token)) {
                stack.push(token);
                continue;
            }

            // if prefix function, like sin, sum,... then put into stack
            // if OP then put to stack
            if (isOP(token)) {
                stack.push(token);
                continue;
            }
            // pop stack to result until OP
            if (isCP(token)) {
                Token cur = stack.pop();
                while (!isOP(cur)) {
                    if (!isComma(cur)) {
                        result.add(new Tok(TokType.OP, cur.getText(), 0));
                    }
                    cur = stack.pop();
                }
                if (!stack.empty() && isOP(stack.peek())) {
                    stack.pop();
                }
                continue;
            }
            // if binary operation o1, while on top of stack is 1)prefix function 2) operation with higher
            // priority 3) left-associative operation with priority like o1 -> push stack element to result
            // then put o1 to stack
            if (isBinaryOperation(token)) {
                if (!stack.empty()) {
                    Token cur = stack.peek();
                    while ((!isBinaryOperation(cur)
                            || (isBinaryOperation(cur) && hasHigherPriority(cur, token))
                            || (hasEqualPriority(cur, token) && isLeftAssociative(token)))
                            && !isOP(cur)
                    ) {
                        if (!isComma(cur)) {
                            result.add(new Tok(TokType.OP, cur.getText(), 0));
                        }

                        stack.pop();
                        if (!stack.empty()) {
                            cur = stack.peek();//  don't pop if priority is less
                        }
                    }
                }
                stack.push(token);
                continue;
            }

            if (isComma(token)) {
                Token cur = stack.peek();
                while (!(isOP(cur) || isComma(cur))) {
                    result.add(new Tok(TokType.OP, cur.getText(), 0));
                    stack.pop();
                    if (!stack.empty()) {
                        cur = stack.peek();//  don't pop if priority is less
                    }
                }
                stack.push(token);

            }
        }
        while (!stack.empty()) {
            Token pop = stack.pop();
            if (!isComma(pop)) {
                result.add(new Tok(TokType.OP, pop.getText(), 0));
            }

        }
        return result;
    }

    private boolean isFunction(Token token) {
        return "'rand'".equals(vocabulary.getLiteralName(token.getType()))
                || "'max'".equals(vocabulary.getLiteralName(token.getType()))
                || "'min'".equals(vocabulary.getLiteralName(token.getType()));
    }

    private boolean isBinaryOperation(Token token) {
        if (vocabulary.getLiteralName(token.getType()) == null) {
            return false;
        }
        switch (vocabulary.getLiteralName(token.getType())) {
            case "'^'":
            case "'*'":
            case "'/'":
            case "'%'":
            case "'+'":
            case "'-'":
                return true;
            default:
                return false;
        }
    }

    private boolean hasHigherPriority(Token stackToken, Token consideredToken) {
        int sp = operationPriority(vocabulary.getLiteralName(stackToken.getType()));
        int cp = operationPriority(vocabulary.getLiteralName(consideredToken.getType()));
        return sp <= cp;
    }

    private boolean hasEqualPriority(Token stackToken, Token consideredToken) {
        int sp = operationPriority(vocabulary.getLiteralName(stackToken.getType()));
        int cp = operationPriority(vocabulary.getLiteralName(consideredToken.getType()));
        return sp == cp;
    }

    private boolean isOP(Token token) {
        return "OP".equals(vocabulary.getSymbolicName(token.getType()));
    }

    private boolean isCP(Token token) {
        return "CP".equals(vocabulary.getSymbolicName(token.getType()));
    }

    private boolean isComma(Token token) {
        return "','".equals(vocabulary.getLiteralName(token.getType()));
    }

    // only ^ is right associative
    private boolean isLeftAssociative(Token token) {
        return !"'^'".equals(token.getText());
    }

    private int operationPriority(String operation) {
        if (operation == null) {
            return 0;
        }
        switch (operation) {
            case "'^'":
                return 0;
            case "'*'":
                return 1;
            case "'/'":
            case "'%'":
                return 2;
            case "'+'":
                return 3;
            case "'-'":
                return 4;
            case "'('":
            case "')'":
                return -1;

            case "','":
                return 15;
            default:
                return 0; // for functions
        }
    }

    private double calculatePolish(List<Tok> tokens, Context c) {
        Stack<Tok> stack = new Stack<>();
        for (Tok token : tokens) {
            if (token.type == TokType.NUM) {
                stack.push(token);
                continue;
            }
            if (token.type == TokType.ID) {
                if (token.name.equals("time")) {
                    stack.push(new Tok(TokType.NUM, null, c.getTime()));
                    continue;
                }
                stack.push(new Tok(TokType.NUM, null, c.getEnvironment().get(token.name)));
                continue;
            }
            if (token.type == TokType.OP) {

                double v2 = stack.pop().value;
                // in case of unary minus or plus
                if (stack.empty() && token.name.equals("-")) {
                    stack.push(new Tok(TokType.NUM, null, -v2));
                    continue;
                }
                if (stack.empty() && token.name.equals("+")) {
                    stack.push(new Tok(TokType.NUM, null, v2));
                    continue;
                }
                double v1 = stack.pop().value;
                switch (token.name) {
                    case "+":
                        stack.push(new Tok(TokType.NUM, null, v1 + v2));
                        break;
                    case "-":
                        stack.push(new Tok(TokType.NUM, null, v1 - v2));
                        break;
                    case "/":
                        stack.push(new Tok(TokType.NUM, null, v1 / v2));
                        break;
                    case "*":
                        stack.push(new Tok(TokType.NUM, null, v1 * v2));
                        break;
                    case "%":
                        stack.push(new Tok(TokType.NUM, null, Math.round(v1) % Math.round(v2)));
                        break;
                    case "^":
                        stack.push(new Tok(TokType.NUM, null, Math.pow(v1, v2)));
                        break;
                    case "rand":
                        stack.push(new Tok(TokType.NUM, null, v1 + (v2 - v1) * rand.nextDouble()));
                        break;
                    case "max":
                        stack.push(new Tok(TokType.NUM, null, Math.max(v1, v2)));
                        break;
                    case "min":
                        stack.push(new Tok(TokType.NUM, null, Math.min(v1, v2)));
                        break;
                }
            }
        }
        return stack.pop().value;
    }

    private class Tok {
        public TokType type;
        public String name;
        public double value;

        public Tok(TokType type, String name, double value) {
            this.type = type;
            this.name = name;
            this.value = value;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Tok{");
            sb.append("type=").append(type);
            sb.append(", name='").append(name).append('\'');
            sb.append(", value=").append(value);
            sb.append('}');
            return sb.toString();
        }
    }

    private enum TokType {
        NUM, ID, OP
    }

}
