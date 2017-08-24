package demo;

import java.util.Map;
import java.util.Stack;

/**
 * Created by gitqh on 24/08/2017.
 */
public class Calculator {
    private Expression expression;

    public  Calculator(String expStr) {
        Stack<Expression> stack = new Stack<Expression>();
        char[] chars = expStr.toCharArray();
        Expression left = null;
        Expression right = null;
        for (int i=0;i<chars.length;i++) {
            switch (chars[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left, right));
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left, right));
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
            }
        }
        this.expression = stack.pop();
    }

    public int run(Map<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
