package family_02_structural.dp_03_bridge.featurs;

/**
 * Created by kobis on 03 Apr, 2023
 */
public class ReverseFeature extends Feature{
    @Override
    public void print(String input) {
        System.out.println(new StringBuffer(input).reverse());
    }
}
