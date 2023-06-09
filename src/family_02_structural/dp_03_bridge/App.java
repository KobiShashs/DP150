package family_02_structural.dp_03_bridge;

import family_02_structural.dp_03_bridge.printers.DeluxPrinter;
import family_02_structural.dp_03_bridge.printers.DummyPrinter;
import family_02_structural.dp_03_bridge.printers.Printer;
import family_02_structural.dp_03_bridge.printers.SababaPrinter;

import java.util.Arrays;

/**
 * Created by kobis on 03 Apr, 2023
 */
public class App {

    public static void main(String[] args) {
        Printer printer1 = new DummyPrinter();

        Printer printer2 = new SababaPrinter();
        Printer printer3 = new DeluxPrinter();
        Printer[] printers = {printer1,printer2,printer3};
        Arrays.stream(printers).forEach(Printer::printTestPage);

    }
}
