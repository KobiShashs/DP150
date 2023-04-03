package family_01_creational.dp_02_factory_method;

import java.util.List;

/**
 * Created by kobis on 03 Apr, 2023
 */
public class App {

    public static void main(String[] args) {
        List<Cat> cats = FactoryUtils.initCats(1000);


        cats.stream().filter(cat->Integer.valueOf(cat.getName().split(" ")[1])%2==0).forEach(System.out::println);
    }
}
