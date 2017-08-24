package demo;

/**
 * Created by gitqh on 24/08/2017.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new OpenningState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
