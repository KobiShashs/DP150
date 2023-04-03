package family_02_structural.dp_02_decorator.base;

/**
 * Created by kobis on 03 Apr, 2023
 */
public class Toast extends Item{
    @Override
    public double cost() {
        return 30.0;
    }

    @Override
    public String description() {
        return "Toast";
    }
}
