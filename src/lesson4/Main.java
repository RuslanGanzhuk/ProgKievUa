package lesson4;

import lesson4.task1.Group;
import lesson4.task1.MyException;
import lesson4.task1.Person;
import lesson4.task1.Student;
import lesson4.task2.OficerImplMilitaryAge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Mike","Andy's",40,true);

        Group group = new Group(123);

        Student jack = new Student("Jack","Johns",20,true,"AKDSM","English",group);
        Student bill = new Student("Bill","Zowen",17,true,"National History Univercity","English",group);
        Student mike = new Student("Mike","Andy's",25,true,"KPI","English",group);
        Student maria = new Student("Maria","Johns",17,false,"National History Univercity","English",group);
        Student jessica = new Student("Jessika","Barby",20,false,"National History Univercity","English",group);
        Student susen = new Student("Susen","Low",22,false,"STNMR","English",group);
        Student kris = new Student("Kris","Snowden",18,true,"History Univercity","English",group);

        OficerImplMilitaryAge oficer = new OficerImplMilitaryAge();

        try{
            group.add(jack);
            group.add(bill);
            group.add(mike);
            group.add(susen);
            group.add(maria);
            group.add(kris);
            group.add(jessica);
        }catch (MyException e){
            System.out.println("Sorry, but You add over students");
        }

//        group.delete(susen);
//        System.out.println(group.toString());
//        group.sortStudentByAge();
//        System.out.println(group.findStudent("Jack"));
//
//        System.out.println("================");
//        group.sortStudentByFirstName();
//        System.out.println("================");
//        group.sortStudentByUnivercity();
//        System.out.println("================");

        oficer.checkStudentForArmy(group);


    }


}
