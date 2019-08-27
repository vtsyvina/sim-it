package sim.core.rule;

import sim.core.model.Context;

import java.util.function.Consumer;

public class GeneralRule implements Rule {

    Consumer<Context> consumer;

    public GeneralRule(Consumer<Context> consumer) {
        this.consumer = consumer;
    }

    @Override
    public void evaluate(Context context) {
        consumer.accept(context);
    }
}
