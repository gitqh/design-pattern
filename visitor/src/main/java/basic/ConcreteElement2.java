package basic;

/**
 * Created by gitqh on 24/08/2017.
 */
public class ConcreteElement2 extends Element {
    public void doSomething() {

    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
