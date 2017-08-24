package demo;

import lombok.Setter;

/**
 * Created by gitqh on 24/08/2017.
 */
public abstract class LiftState {
    @Setter
    protected Context context;

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
