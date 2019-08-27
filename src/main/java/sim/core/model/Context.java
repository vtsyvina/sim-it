package sim.core.model;

public class Context {
    private Environment currentEnvironment;
    private Population currentPopulation;

    private int time = 0;

    public Context(Environment startEnvironment, Population startPopulation) {
        this.currentEnvironment = startEnvironment;
        this.currentPopulation = startPopulation;
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

    /**
     * Ends iteration by updating time and copy values to the next row in environment and population(in case )
     */
    public void endIteration(){
        time++;
        for (int i = 0; i < getPopulation().size(); i++) {
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
