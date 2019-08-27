package sim.core.model;

import java.util.List;

public class Environment extends AbstractDataContainer {

    public Environment(List<String> variables, double[] initValues, int iterations) {
        super(variables, initValues, iterations);
    }
}
