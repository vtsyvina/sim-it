package sim.start;

import sim.core.expression.Expressions;
import sim.core.model.Context;
import sim.core.model.Environment;
import sim.core.model.Population;
import sim.core.rule.BlockRule;
import sim.core.rule.Rule;
import sim.core.rule.RuleExecutor;
import sim.core.rule.Rules;
import sim.core.simulation.Simulation;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        System.out.println("Sim it!");
        toyExample();
    }

    private static void toyExample() {
        int populationSize = 50;
        int iterations = 100000;
        List<String> envNames = new ArrayList<>();
        envNames.add("money");
        envNames.add("tot");
        envNames.add("percent");
        double[] initValues = new double[]{100, 0, 1.0001};
        Environment environment = new Environment(envNames, initValues, iterations);

        List<String> popNames = new ArrayList<>();
        popNames.add("years");
        double[][] initPopValues = new double[populationSize][popNames.size()];
        for (int i = 0; i < populationSize; i++) {
            for (int j = 0; j < popNames.size(); j++) {
                initPopValues[i][j] = 1;
            }
        }
        Population population = new Population(populationSize,popNames, initPopValues, iterations);
        List<Rule> rules = new ArrayList<>();
        int yearsIndex = population.getVariableIndex("years");
        for (int i = 0; i < populationSize; i++) {
            int finalI = i;

            rules.add(Rules.assignment(yearsIndex, i, c-> c.getPopulation().getIndividual(finalI).get(yearsIndex )+1));
        }
        int moneyIndex = environment.getVariableIndex("money");
        int percentIndex = environment.getVariableIndex("percent");
        int totIndex = environment.getVariableIndex("tot");
        rules.add(Rules.assignment(moneyIndex, (c) -> c.getEnvironment().get(moneyIndex) * c.getEnvironment().get(percentIndex)));
        rules.add(Rules.assignment(totIndex, Expressions.sumPopulation(yearsIndex)));
        Context context = new Context(environment, population);
        Simulation simulation = new Simulation(context, new RuleExecutor(new BlockRule(rules)), iterations);
        long start = System.currentTimeMillis();
        simulation.run();
        System.out.println("Simulation time = " + (System.currentTimeMillis() - start) + "ms");
    }
}
