package sim.core.model;

import java.util.List;

public class Individual extends AbstractDataContainer {
    private int id;

    public Individual(int id, List<String> variables, double[] initValues, int iterations, int saveEach){
        super(variables, initValues, iterations, saveEach);
        this.id = id;
    }
    public Individual(int id, List<String> variables, double[] initValues, int iterations) {
        super(variables, initValues, iterations);
        this.id = id;
    }
}
