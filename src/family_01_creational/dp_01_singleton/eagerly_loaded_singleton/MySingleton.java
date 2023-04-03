package family_01_creational.dp_01_singleton.eagerly_loaded_singleton;

/**
 * Created by kobis on 03 Apr, 2023
 */
public class MySingleton {

    // Step 1 - create mutual static instance from the class type
    private static MySingleton instance = new MySingleton();

    // Step 2 - upgrade CTOR to private access modifier
    private MySingleton() {
        System.out.println("Ha ha!");
    }

    // Step 3 - expose your one and only instance
    public static MySingleton getInstance() {
        return instance;
    }
}
