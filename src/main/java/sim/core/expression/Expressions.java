package sim.core.expression;

import sim.core.model.Context;

import java.util.function.Function;

public class Expressions {

    public static Function<Context, Double> averagePopulation(int varIndex) {
        return (context) -> {
            double sum = 0;
            int size = context.getPopulation().size();
            for (int i = 0; i < size; i++) {
                sum += context.getPopulation().getIndividual(i).get(varIndex);
            }
            return sum/context.getPopulation().size();
        };
    }

    public static Function<Context, Double> sumPopulation(int varIndex) {
        return (context) -> {
            double sum = 0;
            int size = context.getPopulation().size();
            for (int i = 0; i < size; i++) {
                sum += context.getPopulation().getIndividual(i).get(varIndex);
            }
            return sum;
        };
    }
}
