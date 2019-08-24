package sim.core.rule;

import sim.core.exception.SimulationException;
import sim.core.model.Context;
import sim.core.model.Environment;
import sim.core.model.Population;

public class RuleExecutor {

    private BlockRule mainRule;
    public long  copyTime = 0;
    public long iterTime = 0;

    public RuleExecutor(BlockRule mainRule){
        this.mainRule = mainRule;
    }

    public void iterate(Context context){
        long start = System.nanoTime();
        context.addCurrentContextToPreviousIterations();

        Environment newEnvironment = context.getEnvironment().copy();
        Population newPopulation = context.getPopulation().copy();
        copyTime += System.nanoTime()-start;
        start = System.nanoTime();
        try {
            mainRule.evaluate(context, newEnvironment, newPopulation);
        } catch (SimulationException e) {
            e.printStackTrace();
            System.out.println("The error occurred during block execution");
            System.exit(1);
        }
        iterTime += System.nanoTime() - start;

        context.updateCurrent(newEnvironment, newPopulation);
    }
}
