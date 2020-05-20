package sim.core.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractDataContainer {
    protected double[][] env;
    protected double[] current;
    protected double[] newIteration;
    protected Map<String, Integer> namesMap = new HashMap<>();
    protected int time = 1;
    protected int saveEach = 1;

    public AbstractDataContainer(List<String> variables, double[] initValues, int iterations, int saveEach) {
        int toSave = iterations/saveEach;
        this.saveEach = saveEach;
        env = new double[toSave+1][variables.size()];
        env[0] = initValues;
        for (int i = 0; i < variables.size(); i++) {
            namesMap.put(variables.get(i), i);
        }
        current = initValues;
        newIteration = new double[initValues.length];
    }
    public AbstractDataContainer(List<String> variables, double[] initValues, int iterations) {
        env = new double[iterations+1][variables.size()];
        env[0] = initValues;
        for (int i = 0; i < variables.size(); i++) {
            namesMap.put(variables.get(i), i);
        }
        current = initValues;
        newIteration = new double[initValues.length];
    }

    public double get(String name, int iteration) {
        return env[iteration][namesMap.get(name)];
       // return get(name);
    }

    public double get(int varIndex) {
//        return env[time-1][varIndex];
        return current[varIndex];
    }
    public double get(String name){
//        return env[time-1][namesMap.get(name)];
        return current[namesMap.get(name)];
    }

    public void set(String name, double value, int iteration) {
        env[iteration][namesMap.get(name)] = value;
    }

    public void set(int varIndex, double value, int iteration) {
        env[iteration][varIndex] = value;
    }

    public void set(int varIndex, double value) {
        newIteration[varIndex] = value;
    }

    public Map<String, Integer> getNamesMap() {
        return namesMap;
    }

    public void endIteration(){
        time++; // update time
        current = newIteration;
        // copy the values in the new row in case we don't have a rule for them
        newIteration = Arrays.copyOf(env[0], env[0].length);
        if((time-1) % saveEach == 0 && time/saveEach>0){
            env[(time-1)/saveEach] = current;
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

    public void print(){
        print(15);
    }
    public void print(int width){
        String[] names = new String[namesMap.size()];
        namesMap.forEach((k,v) -> names[v] = k);
        System.out.print(String.format("%5s", "it"));
        for (int i = 0; i < names.length; i++) {
            System.out.print(String.format("%"+width+"s", names[i]));
        }
        System.out.println();
        int start = 0;
        int end = env.length;
        if(end > 1000){
            start = end - 1000;
        }
        for (int i = start; i < end; i++) {
            System.out.print(String.format("%5d", i*saveEach));
            for (int j = 0; j < env[i].length; j++) {
                System.out.print(String.format("%"+width+"f", env[i][j]));
            }
            System.out.println();
        }

    }
}
