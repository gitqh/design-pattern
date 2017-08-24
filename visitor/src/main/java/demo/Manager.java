package demo;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by gitqh on 24/08/2017.
 */
public class Manager extends Employee {
    @Getter @Setter
    private String performance;

    protected void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
