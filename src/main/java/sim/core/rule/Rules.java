package sim.core.rule;

import sim.core.model.Context;

import java.util.function.Function;

public class Rules {
    public static Rule assignment(int varIndex, Function<Context, Double> expression){
        return new AssignmentRule(varIndex, expression);
    }

    public static Rule assignment(int varIndex, int individualId, Function<Context, Double> expression){
        return new AssignmentRule(varIndex, individualId, expression);
    }
}
