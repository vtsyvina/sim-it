package sim.core.expression;

import sim.core.model.AbstractDataContainer;
import sim.core.model.Context;


public class AverageExpression implements Expression {
    private String varName;

    public AverageExpression(String varName){
        this.varName = varName;
    }

    @Override
    public double evaluateDouble(Context context) {
        double average = 0;
        int size = context.getPopulation().size();
        for (int i = 0; i < size; i++) {
                average += context.getPopulation().getIndividual(i).get(varName);
        }
        return average/size;
    }
}
