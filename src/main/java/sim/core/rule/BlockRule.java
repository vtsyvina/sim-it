package sim.core.rule;

import sim.core.model.Context;

import java.util.ArrayList;
import java.util.List;

public class BlockRule implements Rule {

    private List<Rule> rules;

     public BlockRule(List<Rule> rules){
         this.rules = rules;
     }

     public BlockRule(Rule rule){
         rules = new ArrayList<>();
         rules.add(rule);
     }

    @Override
    public void evaluate(Context context) {
        for (Rule rule : rules) {
            rule.evaluate(context);
        }
    }
}
