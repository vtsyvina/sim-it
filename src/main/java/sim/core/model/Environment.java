package sim.core.model;

import java.util.Map;

public class Environment extends AbstractDataContainer {
    public Environment() {
    }

    public Environment(Map<String, Double> env) {
        super(env);
    }

    public Environment copy() {
        return new Environment(env);
    }
}
