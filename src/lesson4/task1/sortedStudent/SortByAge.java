package lesson4.task1.sortedStudent;

import lesson4.task1.Student;

import java.util.Comparator;

public class SortByAge implements Comparator<Student> {

    @Override
    public int compare(Student std1, Student std2) {

        int std1Age = std1.getAge();
        int std2Age = std2.getAge();

        if(std1Age > std2Age){
            return 1;
        } else if(std1Age < std2Age){
            return -1;
        }
        else
        return 0;
    }
}
