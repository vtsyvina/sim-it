package sim.core.model;

import java.util.ArrayList;
import java.util.List;

public class Context {
    private Environment currentEnvironment;
    private Population currentPopulation;
    private List<Environment> previousEnvironment = new ArrayList<>();
    private List<Population> previousPopulation = new ArrayList<>();

    public Context(){}

    public Context(Environment startEnvironment, Population startPopulation) {
        this.currentEnvironment = startEnvironment;
        this.currentPopulation = startPopulation;
    }

    public void updateCurrent(Environment startEnvironment, Population startPopulation) {
        this.currentEnvironment = startEnvironment;
        this.currentPopulation = startPopulation;
    }

    public Context(Environment currentEnvironment, Population currentPopulation, List<Environment> previousEnvironment, List<Population> previousPopulation) {
        this.currentEnvironment = currentEnvironment;
        this.currentPopulation = currentPopulation;
        this.previousEnvironment = previousEnvironment;
        this.previousPopulation = previousPopulation;
    }

    public Environment getEnvironment(){
        return currentEnvironment;
    }

    public Population getPopulation(){
        return currentPopulation;
    }

    public Context copy(){
        return new Context(currentEnvironment.copy(), currentPopulation.copy(), previousEnvironment, previousPopulation);
    }

    public int getTime(){
        return previousEnvironment.size();
    }


    public void addCurrentContextToPreviousIterations(){
        previousEnvironment.add(currentEnvironment);
        previousPopulation.add(currentPopulation);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Context{");
        sb.append("currentEnvironment=").append(currentEnvironment);
        sb.append(", \ncurrentPopulation=").append(currentPopulation);
        sb.append('}');
        return sb.toString();
    }
}
