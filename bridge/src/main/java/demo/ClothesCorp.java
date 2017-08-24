package demo;

/**
 * Created by gitqh on 24/08/2017.
 */
public class ClothesCorp extends Corp {
    public ClothesCorp(Clothes product) {
        super(product);
    }

    void makeMoney() {
        super.makeMoney();
        System.out.println("clothes make money");
    }

}
