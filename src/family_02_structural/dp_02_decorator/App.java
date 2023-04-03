package family_02_structural.dp_02_decorator;

import family_02_structural.dp_02_decorator.additionals.Corn;
import family_02_structural.dp_02_decorator.additionals.Olives;
import family_02_structural.dp_02_decorator.additionals.Tuna;
import family_02_structural.dp_02_decorator.base.Item;
import family_02_structural.dp_02_decorator.base.Toast;

/**
 * Created by kobis on 03 Apr, 2023
 */
public class App {

    public static void main(String[] args) {
        Item i0 = new Toast();

        Item i1 = new Tuna(i0);
        Item i2 = new Olives(i1);
        Item i3 = new Corn(i2);


        System.out.println(i3.description());
        System.out.println(i3.cost());
    }
}
