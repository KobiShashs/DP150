package family_02_structural.dp_02_decorator.additionals;

import family_02_structural.dp_02_decorator.base.Item;

/**
 * Created by kobis on 03 Apr, 2023
 */
public class Tuna extends Item {

    private Item item;

    public Tuna(Item item) {
        this.item = item;
    }

    @Override
    public double cost() {
        return this.item.cost()+ 3.5;
    }

    @Override
    public String description() {
        return this.item.description()+"+Tuna";
    }
}
