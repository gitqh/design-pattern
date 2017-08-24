package demo;


/**
 * Created by gitqh on 24/08/2017.
 */
public class CommonEmployee extends Employee {
    @lombok.Getter @lombok.Setter
    private String job;

    protected void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
