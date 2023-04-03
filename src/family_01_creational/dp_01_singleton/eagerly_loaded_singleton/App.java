package family_01_creational.dp_01_singleton.eagerly_loaded_singleton;

/**
 * Created by kobis on 03 Apr, 2023
 */
public class App {

    static {
        System.out.println("Static and Ben El");
    }
    public static void main(String[] args) {
        System.out.println("START");
        MySingleton.getInstance();
        MySingleton.getInstance();
        MySingleton.getInstance();
        MySingleton.getInstance();
        MySingleton.getInstance();
        MySingleton.getInstance();
        MySingleton.getInstance();
        MySingleton.getInstance();

        System.out.println("END");


    }
}
