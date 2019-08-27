package sim.core.rule;

import sim.core.exception.SimulationException;
import sim.core.model.Context;

public class RuleExecutor {

    private BlockRule mainRule;

    public RuleExecutor(BlockRule mainRule){
        this.mainRule = mainRule;
    }

    public void iterate(Context context){
        try {
            mainRule.evaluate(context);
        } catch (SimulationException e) {
            e.printStackTrace();
            System.out.println("The error occurred during block execution");
            System.exit(1);
        }
        context.endIteration();
    }
}
