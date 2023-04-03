package family_01_creational.dp_03_abstract_factory.factory;

import family_01_creational.dp_03_abstract_factory.admin.Admin;
import family_01_creational.dp_03_abstract_factory.teachers.Teacher;

import java.util.zip.Adler32;

/**
 * Created by kobis on 03 Apr, 2023
 */
public abstract class ClassFactory {

    public abstract Teacher getTeacher();
    public abstract Admin getAdmin();
}
