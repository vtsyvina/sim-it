package sim.core.simulation;

import sim.core.model.Context;
import sim.core.rule.RuleExecutor;

public class Simulation {
    private Context context;
    private RuleExecutor ruleExecutor;
    private int iterationNumber;

    public Simulation(Context context, RuleExecutor ruleExecutor, int iterationNumber) {
        this.context = context;
        // we have initial values on zero
        context.endIteration();
        this.ruleExecutor = ruleExecutor;
        this.iterationNumber = iterationNumber;
    }

    public void run(){
        System.out.println("Start iterations");
        for (int i = 1; i < iterationNumber; i++) {
            ruleExecutor.iterate(context);
        }
        System.out.println("END");
//        System.out.println(context);
    }

    public Context getContext(){
        return context;
    }
}
