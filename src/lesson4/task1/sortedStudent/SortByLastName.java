package lesson4.task1.sortedStudent;

import lesson4.task1.Student;

import java.util.Comparator;

public class SortByLastName implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {

        String first = student1.getLastName();
        String second = student2.getLastName();

        return first.compareToIgnoreCase(second);
    }
}
