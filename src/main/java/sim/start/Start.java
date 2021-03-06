package sim.start;

import sim.core.expression.Expressions;
import sim.core.model.Context;
import sim.core.model.Environment;
import sim.core.model.Population;
import sim.core.rule.Rule;
import sim.core.rule.RuleExecutor;
import sim.core.rule.Rules;
import sim.core.simulation.Simulation;
import sim.grammar.SimItGrammarParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Start {

    /**
     * ctrl+shift+G to generate grammar in s4 file
     * @param args
     */
    public static void main(String[] args) {
        runFromFile();
//        toyExample();
        System.out.println("Sim it!");
    }

    private static void runFromFile() {
        SimItGrammarParser simItGrammarListener = new SimItGrammarParser();
        Simulation simulation = simItGrammarListener.parseToSimulation(fileToString("examples/complex_individual_vars.txt"),1);
//        Simulation simulation = simItGrammarListener.parseToSimulation(fileToString("src/test/resources/arithmetic.txt"), 10_000);
        simulation.run();
        Context context = simulation.getContext();
//        context.getEnvironment().print();
        System.out.println();
        System.out.println(simItGrammarListener.calcNumber);
        System.out.println(simItGrammarListener.calcBool);
    }

    public static String fileToString(String filename){
        try {
            return new String(Files.readAllBytes(Paths.get(filename)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void toyExample() {
        int populationSize = 50;
        int iterations = 10000;
        List<String> envNames = new ArrayList<>();
        envNames.add("money");
        envNames.add("tot");
        envNames.add("percent");
        double[] initValues = new double[]{100, 0, 1.0001};
        Environment environment = new Environment(envNames, initValues, iterations);

        List<String> popNames = new ArrayList<>();
        popNames.add("years");
        double[][] initPopValues = new double[populationSize][popNames.size()];
        Random r = new Random(2);
        for (int i = 0; i < populationSize; i++) {
            for (int j = 0; j < popNames.size(); j++) {
                initPopValues[i][j] = r.nextInt(100);
            }
        }
        Population population = new Population(populationSize,popNames, initPopValues, iterations);
        List<Rule> rules = new ArrayList<>();
        int yearsIndex = population.getVariableIndex("years");
        int moneyIndex = environment.getVariableIndex("money");
        int percentIndex = environment.getVariableIndex("percent");
        int totIndex = environment.getVariableIndex("tot");

        for (int i = 0; i < populationSize; i++) {
            int finalI = i;
            rules.add(Rules.assignment(yearsIndex, i, c-> c.getPopulation().getIndividual(finalI).get(yearsIndex)+1));
        }
        rules.add(Rules.assignment(moneyIndex, (c) -> c.getEnvironment().get(moneyIndex) * c.getEnvironment().get(percentIndex)));
        rules.add(Rules.assignment(totIndex, Expressions.sumPopulation(yearsIndex)));
        rules.add(Rules.rule(c ->{
            if (c.getTime() > 3000){
                c.getEnvironment().set(percentIndex, 1.);
            }
            if (c.getTime() > 5000){
                c.getEnvironment().set(percentIndex, .99999);
            }
        }));

        rules.add(Rules.filter((c,i) -> c.getPopulation().getIndividual(i).get(yearsIndex) > 50 && c.getEnvironment().get(moneyIndex) > 200, (c,i) -> c.getPopulation().getIndividual(i).set(yearsIndex, 10)));

//        rules.add(Rules.if_((c) -> c.getTime() > 1000, Rules.assignment(percentIndex, c -> 1.), Rules.nothing() ));
//        rules.add(Rules.if_((c) -> c.getTime() > 5000, Rules.assignment(percentIndex, c -> 0.99999), Rules.nothing() ));

        Context context = new Context(environment, population);
        Simulation simulation = new Simulation(context, new RuleExecutor(rules), iterations);
        long start = System.currentTimeMillis();
        simulation.run();
        System.out.println("Simulation time = " + (System.currentTimeMillis() - start) + "ms");
    }
}
