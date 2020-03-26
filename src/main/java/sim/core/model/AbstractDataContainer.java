package sim.core.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractDataContainer {
    protected double[][] env;
    protected Map<String, Integer> namesMap = new HashMap<>();
    protected int time;

    public AbstractDataContainer(List<String> variables, double[] initValues, int iterations) {
        env = new double[iterations][variables.size()];
        env[0] = initValues;
        for (int i = 0; i < variables.size(); i++) {
            namesMap.put(variables.get(i), i);
        }
    }

    public double get(String name, int iteration) {
        return env[iteration][namesMap.get(name)];
    }

    public double get(int varIndex) {
        return env[time-1][varIndex];
    }
    public double get(String name){
        return env[time-1][namesMap.get(name)];
    }

    public double get(String name, int iteration, int variableIndex) {
        return env[iteration][variableIndex];
    }

    public void set(String name, double value, int iteration) {
        env[iteration][namesMap.get(name)] = value;
    }

    public void set(int varIndex, double value, int iteration) {
        env[iteration][varIndex] = value;
    }

    public void set(int varIndex, double value) {
        env[time][varIndex] = value;
    }

    public Map<String, Integer> getNamesMap() {
        return namesMap;
    }

    public void endIteration(){
        time++; // update time
        if (time == env.length){
            return;// don't copy row for last iteration
        }
        // copy the values in the new row in case we don't have a rule for them
        for (int i = 0; i < env[0].length; i++) {
            set(i, get(i));
        }
    }

    public int getVariableIndex(String name){
        return namesMap.getOrDefault(name, -1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n{");
        sb.append("env=").append(Arrays.toString(env[time - 1]));
        sb.append("}");
        return sb.toString();
    }
}
