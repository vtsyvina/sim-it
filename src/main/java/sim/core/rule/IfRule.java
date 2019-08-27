package sim.core.rule;

import sim.core.model.Context;

import java.util.function.Function;

public class IfRule implements Rule {
    private BlockRule thenBlock;
    private BlockRule elseBlock;
    private Function<Context, Boolean> expression;

    public IfRule(Function<Context, Boolean> expression, BlockRule thenBlock, BlockRule elseBlock) {
        this.thenBlock = thenBlock;
        this.elseBlock = elseBlock;
        this.expression = expression;
    }

    @Override
    public void evaluate(Context context) {
        if (expression.apply(context)){
            thenBlock.evaluate(context);
        } else{
            elseBlock.evaluate(context);
        }
    }
}
