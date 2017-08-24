package demo;

import java.util.Map;

/**
 * Created by gitqh on 24/08/2017.
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    public int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var)
                - super.right.interpreter(var);
    }
}
