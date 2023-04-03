package family_01_creational.dp_01_singleton.lazily_loaded_singelton;

/**
 * Created by kobis on 03 Apr, 2023
 */
public class App {

    public static void main(String[] args) {

        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();
        new Thread(()->MySingleton.getInstance()).start();



    }
}
