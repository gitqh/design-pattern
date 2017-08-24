package basic;

/**
 * Created by gitqh on 24/08/2017.
 */
public class Client {
    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
            Element element = ObjectStructure.createElement();
            element.accept(new Visitor());
        }
    }
}
