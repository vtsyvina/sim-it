package sim.core.expression;

import sim.core.model.AbstractDataContainer;
import sim.core.model.Context;


public class SumExpression implements Expression{
    private String varName;

    public SumExpression(String varName) {
        this.varName = varName;
    }

    @Override
    public double evaluateDouble(Context context) {
        double sum = 0;
        int size = context.getPopulation().size();
        for (int i = 0; i < size; i++) {
                sum += context.getPopulation().getIndividual(i).get(varName);
        }
        return sum;
    }
}
