package demo;

/**
 * Created by gitqh on 24/08/2017.
 */
public interface IVisitor {
    void visit(CommonEmployee commonEmployee);
    void visit(Manager manager);
}
