package sim.core.rule;

import sim.core.model.Context;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class Rules {
    public static Rule assignment(int varIndex, Function<Context, Double> expression){
        return new AssignmentRule(varIndex, expression);
    }

    public static Rule assignment(int varIndex, int individualId, Function<Context, Double> expression){
        return new AssignmentRule(varIndex, individualId, expression);
    }

    public static Rule if_(Function<Context, Boolean> expression, BlockRule thenBlock, BlockRule elseBlock){
        return new IfRule(expression, thenBlock, elseBlock);
    }

    public static Rule if_(Function<Context, Boolean> expression, Rule thenRule, Rule elseRule){
        return new IfRule(expression, new BlockRule(thenRule), new BlockRule(elseRule));
    }

    public static Rule nothing(){
        return context -> {};
    }

    public static Rule filter(BiPredicate<Context, Integer> filterFunction, BiConsumer<Context, Integer> thenFunction){
        return new FilterRule(filterFunction, thenFunction);
    }

    public static Rule rule(Consumer<Context> consumer){
        return new GeneralRule(consumer);
    }
}
