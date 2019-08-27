package sim.core.rule;

import sim.core.exception.SimulationException;
import sim.core.model.Context;

public interface Rule {

    void evaluate(Context context) throws SimulationException;
}
