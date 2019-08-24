package sim.core.rule;

import sim.core.exception.SimulationException;
import sim.core.expression.Expression;
import sim.core.model.AbstractDataContainer;
import sim.core.model.Context;
import sim.core.model.Environment;
import sim.core.model.Population;

public class AssignmentRule implements Rule {

    private String varName;
    private int individualIndex = -1;
    private Expression expression;

    public AssignmentRule(String varName, int individualIndex, Expression expression){
        this.varName = varName;
        this.expression = expression;
        this.individualIndex = individualIndex;
    }

    public AssignmentRule(String varName, Expression expression){
        this.varName = varName;
        this.expression = expression;
    }

    @Override
    public void evaluate(Context context, Environment newEnvironment, Population newPopulation) throws SimulationException {
        if (individualIndex == -1){
            setValue(newEnvironment, context);
        } else{
            setValue(newPopulation.getIndividual(individualIndex), context);
        }
    }

    private void setValue(AbstractDataContainer container, Context context) throws SimulationException{
            container.set(varName, expression.evaluateDouble(context));
    }
}
