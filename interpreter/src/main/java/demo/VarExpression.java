package demo;

import lombok.AllArgsConstructor;

import java.util.Map;

/**
 * Created by gitqh on 24/08/2017.
 */
@AllArgsConstructor
public class VarExpression extends Expression {
    private String key;

    public int interpreter(Map<String, Integer> var) {
        return var.get(this.key);
    }
}
