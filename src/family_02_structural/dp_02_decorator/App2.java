package family_02_structural.dp_02_decorator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by kobis on 03 Apr, 2023
 */
public class App2 {

    public static void main(String[] args) throws IOException {
        File file = new File("C:/users/moshe/myfile.txt");
        FileWriter fileWriter = new FileWriter(file,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    }
}
