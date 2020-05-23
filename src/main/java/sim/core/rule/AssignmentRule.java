package sim.core.rule;

import sim.core.model.AbstractDataContainer;
import sim.core.model.Context;
import sim.core.model.Population;

import java.util.function.Function;

public class AssignmentRule implements Rule {

    private int varIndex;
    private int individualIndex = -1;
    private Function<Context, Double> expression;
    private Function<Context, Integer> individualIndexExpression;

    public AssignmentRule(int varIndex, int individualIndex, Function<Context, Double> expression){
        this.varIndex = varIndex;
        this.expression = expression;
        this.individualIndex = individualIndex;
    }

    public AssignmentRule(int varIndex, Function<Context, Integer> individualIndexExpression, Function<Context, Double> expression){
        this.varIndex = varIndex;
        this.expression = expression;
        this.individualIndexExpression = individualIndexExpression;
    }

    public AssignmentRule(int varIndex, Function<Context, Double> expression){
        this.varIndex = varIndex;
        this.expression = expression;
    }

    @Override
    public void evaluate(Context context) {
        if (individualIndex == -1){
            setValue(context.getEnvironment(), context);
        } else if(individualIndexExpression == null){
            setValue(context.getPopulation().getIndividual(individualIndex), context);
        } else{
            setValue(context.getPopulation(), context);
        }
    }

    private void setValue(AbstractDataContainer container, Context context){
            container.set(varIndex, expression.apply(context));
    }

    private  void setValue(Population population, Context context){
        population.getIndividual(individualIndexExpression.apply(context)).set(varIndex, expression.apply(context));
    }
}
