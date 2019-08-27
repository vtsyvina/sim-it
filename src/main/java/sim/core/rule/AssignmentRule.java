package sim.core.rule;

import sim.core.exception.SimulationException;
import sim.core.model.AbstractDataContainer;
import sim.core.model.Context;

import java.util.function.Function;

public class AssignmentRule implements Rule {

    private int varIndex;
    private int individualIndex = -1;
    private Function<Context, Double> expression;

    public AssignmentRule(int varIndex, int individualIndex, Function<Context, Double> expression){
        this.varIndex = varIndex;
        this.expression = expression;
        this.individualIndex = individualIndex;
    }

    public AssignmentRule(int varIndex, Function<Context, Double> expression){
        this.varIndex = varIndex;
        this.expression = expression;
    }

    @Override
    public void evaluate(Context context) {
        if (individualIndex == -1){
            setValue(context.getEnvironment(), context);
        } else{
            setValue(context.getPopulation().getIndividual(individualIndex), context);
        }
    }

    private void setValue(AbstractDataContainer container, Context context){
            container.set(varIndex, expression.apply(context));
    }
}
