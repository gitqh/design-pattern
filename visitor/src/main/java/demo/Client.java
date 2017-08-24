package demo;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by gitqh on 24/08/2017.
 */
public class Client {
    public static void main(String[] args) {
        for (Employee employee:mockEmployee()) {
            employee.accept(new Visitor());
        }
    }

    public static List<Employee> mockEmployee() {
        List<Employee> employeeList = Lists.newArrayList();
        CommonEmployee zhangsan = new CommonEmployee();
        zhangsan.setJob("java programming");
        zhangsan.setName("zhangsan");
        zhangsan.setSex(Employee.MALE);
        zhangsan.setSalary(8000);

        CommonEmployee lisi = new CommonEmployee();
        lisi.setJob("c programming");
        lisi.setName("lisi");
        lisi.setSex(Employee.MALE);
        lisi.setSalary(8200);

        Manager wangwu = new Manager();
        wangwu.setPerformance("c programming");
        wangwu.setName("lisi");
        wangwu.setSex(Employee.MALE);
        wangwu.setSalary(8200);

        employeeList.add(zhangsan);
        employeeList.add(lisi);
        employeeList.add(wangwu);

        return employeeList;
    }
}
