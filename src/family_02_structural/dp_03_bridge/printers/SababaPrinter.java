package family_02_structural.dp_03_bridge.printers;

import family_02_structural.dp_03_bridge.featurs.RegularFeature;
import family_02_structural.dp_03_bridge.featurs.ReverseFeature;
import family_02_structural.dp_03_bridge.featurs.UpperFeatures;

/**
 * Created by kobis on 03 Apr, 2023
 */
public class SababaPrinter extends Printer{
    @Override
    protected void uploadFeatures() {
        this.features.add(new RegularFeature());
        this.features.add(new UpperFeatures());
        this.features.add(new ReverseFeature());
    }
}
