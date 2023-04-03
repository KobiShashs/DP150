package family_02_structural.dp_02_decorator.additionals;

import family_02_structural.dp_02_decorator.base.Item;

/**
 * Created by kobis on 03 Apr, 2023
 */
public class Corn extends Item {

    private Item item;

    public Corn(Item item) {
        this.item = item;
    }

    @Override
    public double cost() {
        return this.item.cost()+ 4;
    }

    @Override
    public String description() {
        return this.item.description()+"+Corn";
    }
}
