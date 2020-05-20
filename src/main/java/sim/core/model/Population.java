package sim.core.model;

import java.util.ArrayList;
import java.util.List;

public class Population {
    private List<Individual> individuals = new ArrayList<>();

    public Population(int size, List<String> variables, double[][] initValues, int iterations, int saveEach){
        for (int i = 0; i < size; i++) {
            individuals.add(new Individual(i, variables, initValues[i], iterations, saveEach));
        }
    }

    public Population(int size, List<String> variables, double[][] initValues, int iterations){
        for (int i = 0; i < size; i++) {
            individuals.add(new Individual(i, variables, initValues[i], iterations));
        }
    }

    public int size(){
        return individuals.size();
    }

    public Individual getIndividual(int index){
        return individuals.get(index);
    }

    public int getVariableIndex(String name){
        return individuals.get(0).getNamesMap().get(name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Population{");
        sb.append("individuals=").append(individuals);
        sb.append("\n}");
        return sb.toString();
    }
}
