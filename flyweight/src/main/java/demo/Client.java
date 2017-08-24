package demo;

/**
 * Created by gitqh on 24/08/2017.
 */
public class Client {
    public static void main(String[] args) {
        for (int i=0;i<4;i++) {
            String subject = "class" + i;
            for (int j=0;j<30;j++) {
                String key = subject+" position" + j;
                SignInfoFactory.getSignInfo(key);
            }
        }
        SignInfo signInfo = SignInfoFactory.getSignInfo("class1 position1");
    }
}
