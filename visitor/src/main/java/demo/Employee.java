package demo;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by gitqh on 24/08/2017.
 */
public abstract class Employee {
    public final static int MALE = 0;
    public final static int FEMALE = 1;

    @Getter @Setter
    private String name;
    @Getter @Setter
    private int salary;
    @Getter @Setter
    private int sex;

    protected abstract void accept(IVisitor visitor);

}
