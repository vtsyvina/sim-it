package sim.core.model;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractDataContainer {

    protected Map<String, Double> env = new HashMap<>();

    public AbstractDataContainer(){};
    public AbstractDataContainer(Map<String, Double> env) {
        this.env = env;
    }

    public double get(String name, double defaultValue){
        return env.getOrDefault(name, defaultValue);
    }

    public double get(String name){
        return get(name, 0);
    }

    public void set(String name, double value){
        env.put(name, value);
    }



    public enum  VarType{
        INT, DOUBLE, NONE;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n{");
        sb.append("env=").append(env);
        sb.append("}");
        return sb.toString();
    }
}
