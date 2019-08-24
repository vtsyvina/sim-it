package sim.core.model;

import java.util.ArrayList;
import java.util.List;

public class Population {
    private List<Individual> individuals = new ArrayList<>();

    private Population(){}

    public Population(int size){
        for (int i = 0; i < size; i++) {
            individuals.add(new Individual());
        }
    }

    public int size(){
        return individuals.size();
    }

    public Individual getIndividual(int index){
        return individuals.get(index);
    }

    public Population copy(){
        Population result = new Population();
        for (Individual individual : this.individuals) {
            result.individuals.add(individual.copy());
        }
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Population{");
        sb.append("individuals=").append(individuals);
        sb.append("\n}");
        return sb.toString();
    }
}
