package sim.core.rule;

import sim.core.model.Context;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class FilterRule implements Rule {

    BiPredicate<Context, Integer> filterFunction;
    BiConsumer<Context, Integer> thenFunction;

    public FilterRule(BiPredicate<Context, Integer> filterFunction, BiConsumer<Context, Integer> thenFunction) {
        this.filterFunction = filterFunction;
        this.thenFunction = thenFunction;
    }

    @Override
    public void evaluate(Context context) {
        int size = context.getPopulation().size();
        for (int i = 0; i < size; i++) {
            if (filterFunction.test(context,i)){
                thenFunction.accept(context, i);
            }
        }
    }
}
