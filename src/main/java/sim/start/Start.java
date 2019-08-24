package sim.start;

import sim.core.expression.Expression;
import sim.core.expression.SumExpression;
import sim.core.model.Context;
import sim.core.model.Environment;
import sim.core.model.Population;
import sim.core.rule.AssignmentRule;
import sim.core.rule.BlockRule;
import sim.core.rule.Rule;
import sim.core.rule.RuleExecutor;
import sim.core.simulation.Simulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        System.out.println("Sim it!");
        toyExample();
    }

    private static void toyExample() {
        int populationSize = 50;

        Environment environment = new Environment();
        Population population = new Population(populationSize);
        environment.set("money", 100);
        environment.set("tot", 0);
        environment.set("percent", 1.0001);
        for (int i = 0; i < populationSize; i++) {
            population.getIndividual(i).set("years", 0);
        }
        List<Rule> rules = new ArrayList<>();
        for (int i = 0; i < populationSize; i++) {
            int finalI = i;
            rules.add(new AssignmentRule("years", i, new Expression() {
                @Override
                public double evaluateDouble(Context context) {
                    return context.getPopulation().getIndividual(finalI).get("years")+1;
                }
            }));
        }
        rules.add(new AssignmentRule("money", new Expression() {
            @Override
            public double evaluateDouble(Context context) {
                return context.getEnvironment().get("money")*context.getEnvironment().get("percent");
            }
        }));
        rules.add(new AssignmentRule("tot", new SumExpression("years")));
        Context context = new Context(environment, population);
        Simulation simulation = new Simulation(context, new RuleExecutor(new BlockRule(rules)), 100000);
        long start = System.currentTimeMillis();
        simulation.run();
        System.out.println("Simulation time = "+(System.currentTimeMillis()-start)+"ms");
    }
}
