package sim.core.model;

import java.util.Random;

public class Context {
    private Environment currentEnvironment;
    private Population currentPopulation;

    private Random random;
    // for time = 0 we save initial values, so start with 1
    private int time = 1;

    public Context(Environment startEnvironment, Population startPopulation) {
        this.currentEnvironment = startEnvironment;
        this.currentPopulation = startPopulation;
        random = new Random();
    }

    public Context(Environment startEnvironment, Population startPopulation, int randomSeed){
        this.currentEnvironment = startEnvironment;
        this.currentPopulation = startPopulation;
        random = new Random(randomSeed);
    }

    public void updateCurrent(Environment startEnvironment, Population startPopulation) {
        this.currentEnvironment = startEnvironment;
        this.currentPopulation = startPopulation;
    }

    public Environment getEnvironment(){
        return currentEnvironment;
    }

    public Population getPopulation(){
        return currentPopulation;
    }

    public int getTime(){
        return time;
    }

    public int getInt(int bound){
        return random.nextInt(bound);
    }

    public int getInt(int lowerBound, int upperBound){
        return lowerBound+random.nextInt(upperBound-lowerBound);
    }

    public double getDouble(){
        return random.nextDouble();
    }

    /**
     * Ends iteration by updating time and copy values to the next row in environment and population(in case )
     */
    public void endIteration(){
        time++;
        int size = getPopulation().size();
        for (int i = 0; i < size; i++) {
            getPopulation().getIndividual(i).endIteration();
        }
        getEnvironment().endIteration();
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
