package sim.core.rule;

import sim.core.model.Context;

import java.util.List;

public class RuleExecutor {

    private BlockRule mainRule;

    public RuleExecutor(BlockRule mainRule){
        this.mainRule = mainRule;
    }

    public RuleExecutor(List<Rule> rules){
        this.mainRule = new BlockRule(rules);
    }

    public void iterate(Context context){
        mainRule.evaluate(context);
        context.endIteration();
    }
}
