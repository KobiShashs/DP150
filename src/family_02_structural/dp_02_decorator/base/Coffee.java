package family_02_structural.dp_02_decorator.base;

/**
 * Created by kobis on 03 Apr, 2023
 */
public class Coffee extends Item{
    @Override
    public double cost() {
        return 10.0;
    }

    @Override
    public String description() {
        return "Coffee";
    }
}
