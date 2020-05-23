package sim.algorithm;

import sim.core.model.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

import static sim.algorithm.ReversePolishNotation.TokType.BOOL;
import static sim.algorithm.ReversePolishNotation.TokType.COMMA;
import static sim.algorithm.ReversePolishNotation.TokType.CP;
import static sim.algorithm.ReversePolishNotation.TokType.FUN;
import static sim.algorithm.ReversePolishNotation.TokType.ID;
import static sim.algorithm.ReversePolishNotation.TokType.NUM;
import static sim.algorithm.ReversePolishNotation.TokType.OP;
import static sim.algorithm.ReversePolishNotation.TokType.OPERATION;

public class ReversePolishNotation {
    private Random rand = new Random(1);
    private Set<String> populationVariableNames;

    public ReversePolishNotation(Set<String> populationVariableNames){
        this.populationVariableNames = populationVariableNames;
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
     * @return
     */
    public List<Tok> reversePolishNotation(List<Tok> tokens) {
        List<Tok> result = new ArrayList<>();
        //Interval sourceInterval = ctx.getSourceInterval();
        //List<Token> tokens = commonTokenStream.get(sourceInterval.a, sourceInterval.b);
        Stack<Tok> stack = new Stack<>();
        //https://en.wikipedia.org/wiki/Shunting-yard_algorithm
        // with small adjustment for expressions in functions. Wiki example works only for constants as arguments
        for (Tok token : tokens) {
            // if postfix function (like !) or number/identificator then add to result
            if (token.type == NUM || token.type == BOOL || token.type == ID) {
                result.add(token);
                continue;
            }
            if (token.type == TokType.FUN) {
                stack.push(token);
                continue;
            }

            // if prefix function, like sin, sum,... then put into stack
            // if OP then put to stack
            if (token.type == OP) {
                stack.push(token);
                continue;
            }
            // pop stack to result until OP
            if (token.type == CP) {
                Tok cur = stack.pop();
                while (cur.type != OP) {
                    if (cur.type != COMMA) {
                        result.add(cur);
                    }
                    cur = stack.pop();
                }
                continue;
            }
            // if binary operation o1, while on top of stack is 1)prefix function 2) operation with higher
            // priority 3) left-associative operation with priority like o1 -> push stack element to result
            // then put o1 to stack
            if (token.type == OPERATION) {
                if (!stack.empty()) {
                    Tok cur = stack.peek();
                    while ((cur.type != OPERATION
                            || (cur.type == OPERATION && hasHigherPriority(cur, token))
                            || (hasEqualPriority(cur, token) && isLeftAssociative(token)))
                            && cur.type != OP
                    ) {
                        if (cur.type != COMMA) {
                            result.add(cur);
                        }

                        stack.pop();
                        if (!stack.empty()) {
                            cur = stack.peek();//  don't pop if priority is less
                        } else {
                            break;
                        }
                    }
                }
                stack.push(token);
                continue;
            }

            if (token.type == COMMA) {
                Tok cur = stack.peek();
                while (!(cur.type == OP || cur.type == COMMA)) {
                    result.add(cur);
                    stack.pop();
                    if (!stack.empty()) {
                        cur = stack.peek();//  don't pop if priority is less
                    }
                }
                stack.push(token);

            }
        }
        while (!stack.empty()) {
            Tok pop = stack.pop();
            if (pop.type != COMMA) {
                result.add(pop);
            }

        }
        return result;
    }

    private boolean hasHigherPriority(Tok stackToken, Tok consideredToken) {
        int sp = operationPriority(stackToken.name);
        int cp = operationPriority(consideredToken.name);
        return sp >= cp;
    }

    private boolean hasEqualPriority(Tok stackToken, Tok consideredToken) {
        int sp = operationPriority(stackToken.name);
        int cp = operationPriority(consideredToken.name);
        return sp == cp;
    }

    // only ^ is right associative
    private boolean isLeftAssociative(Tok token) {
        return !"^".equals(token.name);
    }

    private int operationPriority(String operation) {
        if (operation == null) {
            return 0;
        }
        return switch (operation) {
            case "^" -> 15;
            case "*" -> 14;
            case "/", "%" -> 13;
            case "+" -> 12;
            case "-" -> 11;
            case ">", "<", ">=", "<=" -> 10;
            case "==", "!=" -> 9;
            case "&&" -> 8;
            case "||" -> 7;
            case "," -> 1;
            // for functions
            default -> 20;
        };
    }

    public boolean calculatePolishBoolean(List<Tok> tokens, Context c) {
        return calculatePolish(tokens, c).bool;
    }

    public double calculatePolishNumber(List<Tok> tokens, Context c) {
        return calculatePolish(tokens, c).value;
    }

    // i - variable of the loop if we calculate for an individual
    public double calculatePolishNumber(List<Tok> tokens, Context c, int i) {
        return calculatePolish(tokens, c, i).value;
    }

    private Tok calculatePolish(List<Tok> tokens, Context c) {
        return calculatePolish(tokens, c, 0);
    }

    // i - variable of the loop if we calculate for an individual
    private Tok calculatePolish(List<Tok> tokens, Context c, int i) {
        Stack<Tok> stack = new Stack<>();
        for (Tok token : tokens) {
            if (token.type == NUM || token.type == BOOL) {
                stack.push(token);
                continue;
            }
            if (token.type == TokType.ID) {
                if (token.name.equals("time")) {
                    stack.push(new Tok(c.getTime()));
                    continue;
                }
                if(token.name.equals("i")){
                    stack.push(new Tok(i));
                    continue;
                }
                stack.push(new Tok(c.getEnvironment().get(token.name)));
                continue;
            }
            if (token.type == OPERATION || token.type == FUN) {

                Tok pop2 = stack.pop();
                double v2 = pop2.value;
                boolean b2 = pop2.bool;
                // in case of unary minus or plus
                if (stack.empty() && token.name.equals("-")) {
                    stack.push(new Tok(-v2));
                    continue;
                }
                if (stack.empty() && token.name.equals("+")) {
                    stack.push(new Tok(v2));
                    continue;
                }
                if (token.name.equals("!")) {
                    stack.push(new Tok(!b2));
                    continue;
                }
                if (populationVariableNames.contains(token.name)){
                    stack.push(new Tok(c.getPopulation().getIndividual((int)Math.round(v2)).get(token.name)));
                    continue;
                }
                Tok pop1 = stack.pop();
                double v1 = pop1.value;
                boolean b1 = pop1.bool;
                switch (token.name) {
                    case "+" -> stack.push(new Tok(v1 + v2));
                    case "-" -> stack.push(new Tok(v1 - v2));
                    case "/" -> stack.push(new Tok(v1 / v2));
                    case "*" -> stack.push(new Tok(v1 * v2));
                    case "%" -> stack.push(new Tok(Math.round(v1) % Math.round(v2)));
                    case "^" -> stack.push(new Tok(Math.pow(v1, v2)));
                    case "rand" -> stack.push(new Tok(v1 + (v2 - v1) * rand.nextDouble()));
                    case "max" -> stack.push(new Tok(Math.max(v1, v2)));
                    case "min" -> stack.push(new Tok(Math.min(v1, v2)));
                    case ">" -> stack.push(new Tok(v1 > v2));
                    case "<" -> stack.push(new Tok(v1 < v2));
                    case ">=" -> stack.push(new Tok(v1 >= v2));
                    case "<=" -> stack.push(new Tok(v1 <= v2));
                    case "==" -> {
                        if (pop2.type == NUM) {
                            stack.push(new Tok(v1 == v2));
                        } else {
                            stack.push(new Tok(b1 == b2));
                        }
                    }
                    case "!=" -> {
                        if (pop2.type == NUM) {
                            stack.push(new Tok(v1 != v2));
                        } else {
                            stack.push(new Tok(b1 != b2));
                        }
                    }
                    case "&&" -> stack.push(new Tok(b1 && b2));
                    case "||" -> stack.push(new Tok(b1 || b2));
                }
            }
        }
        return stack.pop();
    }

    public static class Tok {
        public TokType type;
        public String name;
        public double value;
        public boolean bool;

        public Tok(double value) {
            this.type = TokType.NUM;
            this.value = value;
        }

        public Tok(TokType type, String name) {
            this.type = type;
            this.name = name;
        }

        public Tok(boolean bool) {
            this.type = TokType.BOOL;
            this.bool = bool;
        }

        public String toString() {
            return switch (type) {
                case NUM -> String.valueOf(value);
                case ID, OPERATION, CP, OP, FUN, COMMA -> name;
                case BOOL -> String.valueOf(bool);
            };
        }
    }

    public enum TokType {
        NUM, ID, OPERATION, BOOL, CP, OP, FUN, COMMA
    }
}
