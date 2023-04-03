package family_02_structural.dp_03_bridge.printers;

import family_02_structural.dp_03_bridge.featurs.*;

/**
 * Created by kobis on 03 Apr, 2023
 */
public class DeluxPrinter extends Printer{
    @Override
    protected void uploadFeatures() {
        this.features.add(new RegularFeature());
        this.features.add(new UpperFeatures());
        this.features.add(new LowerFeature());
        this.features.add(new ReverseFeature());
        this.features.add(new TabbedFeature());
    }
}
