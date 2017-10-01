package lesson4.task1.sortedStudent;

import lesson4.task1.Student;

import java.util.Comparator;

public class SortByUnivercity implements Comparator<Student>{
    @Override
    public int compare(Student std1, Student std2) {

        String studen1University = std1.getUnivercity();
        String studen2University = std2.getUnivercity();

        return studen1University.compareToIgnoreCase(studen2University);
    }
}
