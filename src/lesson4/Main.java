package lesson4;

import lesson4.task1.Group;
import lesson4.task1.MyException;
import lesson4.task1.Person;
import lesson4.task1.Student;

public class Main {
    public static void main(String[] args) {

        Student studen = new Student("Jack","Johns",20,true,"KPI","English",123);
        Student studen1 = new Student("Bill","Zowen",20,true,"KPI","English",123);
        Person person = new Person("Mike","Andy's",40,true);
        Student studen2 = new Student("Mike","Andy's",20,true,"KPI","English",123);

        Group group = new Group();

        person.getInfo();
        studen.getInfo();

        try{
            group.add(studen);
            group.add(studen1);
            group.add(studen2);
            group.add(studen2);
        }catch (MyException e){
            System.out.println("Sorry, but You add over students");
        }

        group.delete(studen1);
        System.out.println(group.toString());
        System.out.println(group.findStudent("Jack"));

    }


}
