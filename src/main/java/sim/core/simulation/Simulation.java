package sim.core.simulation;

import sim.core.model.Context;
import sim.core.rule.RuleExecutor;

public class Simulation {
    private Context context;
    private RuleExecutor ruleExecutor;
    private int iterationNumber = 1;

    public Simulation(Context context, RuleExecutor ruleExecutor, int iterationNumber) {
        this.context = context;
        this.ruleExecutor = ruleExecutor;
        this.iterationNumber = iterationNumber;
    }

    public void run(){
        for (int i = 0; i < iterationNumber; i++) {
            ruleExecutor.iterate(context);
        }
        System.out.println("END");
        System.out.println("copy time ="+ruleExecutor.copyTime);
        System.out.println("iter time ="+ruleExecutor.iterTime);
        System.out.println(context);
    }
}
