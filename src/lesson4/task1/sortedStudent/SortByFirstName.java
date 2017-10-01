package lesson4.task1.sortedStudent;

import lesson4.task1.Student;

import java.util.Comparator;

public class SortByFirstName implements Comparator<Student>{

    @Override
    public int compare(Student std1, Student std2) {

        String student1 = std1.getFirstName();
        String student2 = std2.getFirstName();

        return student1.compareToIgnoreCase(student2);
    }
}
