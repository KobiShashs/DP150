package family_01_creational.dp_05_prototytpe;

/**
 * Created by kobis on 03 Apr, 2023
 */
public class Cat {

    private int id;
    private String name;

    public Cat(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Cat(Cat other) {
        this.id = other.id;
        this.name = other.name;
    }

    @Override
    protected Cat clone() {
        return new Cat(this);
    }
}
