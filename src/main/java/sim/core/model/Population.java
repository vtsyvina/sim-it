package sim.core.model;

import java.util.List;

public class Population {
    private Individual[] individuals;

    public Population(int size, List<String> variables, double[][] initValues, int iterations, int saveEach){
        individuals = new Individual[size];
        for (int i = 0; i < size; i++) {
            individuals[i] = new Individual(i, variables, initValues[i], iterations, saveEach);
        }
    }

    public Population(int size, List<String> variables, double[][] initValues, int iterations){
         individuals = new Individual[size];
        for (int i = 0; i < size; i++) {
            individuals[i] = new Individual(i, variables, initValues[i], iterations);
        }
    }

    public int size(){
        return individuals.length;
    }

    public Individual getIndividual(int index){
        return individuals[index];
    }

    public int getVariableIndex(String name){
        return individuals[0].getNamesMap().get(name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Population{");
        sb.append("individuals=").append(individuals);
        sb.append("\n}");
        return sb.toString();
    }
}
