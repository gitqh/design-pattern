package demo;

/**
 * Created by gitqh on 24/08/2017.
 */
public class Client {
    public static void main(String[] args) {
        Corp houseCorp = new HouseCorp(new House());
        houseCorp.makeMoney();
        Corp clothesCorp = new ClothesCorp(new Clothes());
        clothesCorp.makeMoney();
    }
}
