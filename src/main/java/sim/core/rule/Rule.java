package sim.core.rule;

import sim.core.exception.SimulationException;
import sim.core.model.Context;
import sim.core.model.Environment;
import sim.core.model.Population;

public interface Rule {

    void evaluate(Context context, Environment newEnvironment, Population newPopulation) throws SimulationException;
}
