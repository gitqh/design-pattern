package demo;

/**
 * Created by gitqh on 24/08/2017.
 */
public class RunningState extends LiftState {
    public void open() {

    }

    public void close() {

    }

    public void run() {
        System.out.println("run");
    }

    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}
