package demo;

import lombok.AllArgsConstructor;

import java.util.Map;

/**
 * Created by gitqh on 24/08/2017.
 */
@AllArgsConstructor
public class SymbolExpression extends Expression{
    protected Expression left;
    protected Expression right;

    public int interpreter(Map<String, Integer> var) {
        return 0;
    }
}
