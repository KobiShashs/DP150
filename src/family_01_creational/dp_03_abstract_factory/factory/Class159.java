package family_01_creational.dp_03_abstract_factory.factory;

import family_01_creational.dp_03_abstract_factory.admin.Admin;
import family_01_creational.dp_03_abstract_factory.admin.Moran;
import family_01_creational.dp_03_abstract_factory.teachers.Kobi;
import family_01_creational.dp_03_abstract_factory.teachers.Teacher;

/**
 * Created by kobis on 03 Apr, 2023
 */
public class Class159 extends ClassFactory{
    @Override
    public Teacher getTeacher() {
        return new Kobi();
    }

    @Override
    public Admin getAdmin() {
        return new Moran();
    }
}
