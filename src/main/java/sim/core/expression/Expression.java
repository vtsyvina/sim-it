package sim.core.expression;

import sim.core.model.Context;

public interface Expression {
    default double evaluateDouble(Context context){ return 0;};
    default boolean evaluateBool(Context context){ return false;};
}
