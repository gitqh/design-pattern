package basic;

import java.util.Random;

/**
 * Created by gitqh on 24/08/2017.
 */
public class ObjectStructure {
    public static Element createElement() {
        Random random = new Random();
        if (random.nextInt(100) > 50) {
            return new ConcreteElement1();
        } else {
            return new ConcreteElement2();
        }
    }
}
