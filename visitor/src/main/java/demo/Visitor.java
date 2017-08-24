package demo;

/**
 * Created by gitqh on 24/08/2017.
 */
public class Visitor implements IVisitor {
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployeeInfo(commonEmployee));
    }

    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    private String getBasicInfo(Employee employee) {
        return "name:" + employee.getName() + " sex:" +
                employee.getSex() + " salary:" + employee.getSalary()
                ;
    }

    private String getManagerInfo(Manager manager) {
        return getBasicInfo(manager) + " performance:"+manager.getPerformance();
    }

    private String getCommonEmployeeInfo(CommonEmployee commonEmployee) {
        return getBasicInfo(commonEmployee) + " job:" + commonEmployee.getJob();
    }
}
