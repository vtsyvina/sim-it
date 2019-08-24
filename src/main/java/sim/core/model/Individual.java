package sim.core.model;

import java.util.HashMap;
import java.util.Map;

public class Individual extends AbstractDataContainer {
    private int id;

    public Individual() {
    }

    public Individual(int id){
        this.id = id;
    }

    public Individual(int id, Map<String, Double> env) {
        super(env);
        this.id = id;
    }


    public Individual copy() {
        return new Individual(id, new HashMap<>(env));
    }
}
