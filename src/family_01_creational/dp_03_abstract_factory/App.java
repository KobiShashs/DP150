package family_01_creational.dp_03_abstract_factory;

import family_01_creational.dp_03_abstract_factory.factory.Class150;
import family_01_creational.dp_03_abstract_factory.factory.Class159;
import family_01_creational.dp_03_abstract_factory.factory.ClassFactory;

/**
 * Created by kobis on 03 Apr, 2023
 */
public class App {

    public static void main(String[] args) {
        ClassFactory myClass = null;
        myClass = new Class159();
        myClass.getTeacher().name();
        myClass.getAdmin().name();
        System.out.println("-------------------");

        myClass = new Class150();
        myClass.getTeacher().name();
        myClass.getAdmin().name();
    }
}
