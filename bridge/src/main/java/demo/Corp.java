package demo;

/**
 * Created by gitqh on 24/08/2017.
 */
public abstract class Corp {
    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    void makeMoney() {
        this.product.beProducted();
        this.product.beSelled();
    }
}
