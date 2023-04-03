package family_02_structural.dp_03_bridge.printers;

import family_02_structural.dp_03_bridge.featurs.RegularFeature;

/**
 * Created by kobis on 03 Apr, 2023
 */
public class DummyPrinter extends Printer{
    @Override
    protected void uploadFeatures() {
        this.features.add(new RegularFeature());
    }
}
