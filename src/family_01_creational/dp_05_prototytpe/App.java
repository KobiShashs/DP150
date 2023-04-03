package family_01_creational.dp_05_prototytpe;

/**
 * Created by kobis on 03 Apr, 2023
 */
public class App {

    public static void main(String[] args) {
        Cat c1 = new Cat(123, "Mitzi");
        Cat c2 = c1;

        System.out.println("-----------------");

        Cat c3 = new Cat(123, "Mitzi");
        Cat c4 = new Cat(c3);

        System.out.println("-----------------");
        Cat c5 = new Cat(123, "Mitzi");
        Cat c6 = c5.clone();
    }
}
