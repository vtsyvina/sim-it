package sim.core.rule;

import sim.core.exception.SimulationException;
import sim.core.model.Context;
import sim.core.model.Environment;
import sim.core.model.Population;

import java.util.List;

public class BlockRule implements Rule {

    private List<Rule> rules;

     public BlockRule(List<Rule> rules){
         this.rules = rules;
     }

    @Override
    public void evaluate(Context context, Environment newEnvironment, Population newPopulation) throws SimulationException {
        for (Rule rule : rules) {
            rule.evaluate(context, newEnvironment, newPopulation);
        }
    }
}
