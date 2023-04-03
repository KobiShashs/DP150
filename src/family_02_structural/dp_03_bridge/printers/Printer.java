package family_02_structural.dp_03_bridge.printers;

import family_02_structural.dp_03_bridge.featurs.Feature;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kobis on 03 Apr, 2023
 */
public abstract class Printer {

    protected List<Feature> features = new ArrayList<>();

    public Printer(){
        uploadFeatures();
    }

    protected abstract void uploadFeatures();

    public void printTestPage(){
        String str = "This is a Test Java 150";
        System.out.println(this.getClass().getSimpleName());
        for (Feature f:features) {
            f.print(str);
        }
        System.out.println("-----------------------------------");
    }
}
