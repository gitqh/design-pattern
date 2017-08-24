package demo;

/**
 * Created by gitqh on 24/08/2017.
 */
public class HouseCorp extends Corp {
    public HouseCorp(House product) {
        super(product);
    }

    void makeMoney() {
        super.makeMoney();
        System.out.println("house make money");
    }


}
