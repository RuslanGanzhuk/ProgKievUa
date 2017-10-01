package lesson4.task1;

import lesson4.task1.sortedStudent.SortByAge;
import lesson4.task1.sortedStudent.SortByFirstName;
import lesson4.task1.sortedStudent.SortByLastName;
import lesson4.task1.sortedStudent.SortByUnivercity;

import java.util.Arrays;

public class Group {

    private long id;
    public static final int COPASITY = 10;
    private int checkMax;
    private Student[] groupStudents = new Student[checkMax];

    public Group(long id) {
        this.id = id;
    }

    public Group(){

    }

    public void add(Student student) throws MyException {
        if(COPASITY == checkMax){
            throw new MyException();
        }

        if(checkStudent(student) == true){
            System.out.println("This student: " + student.getLastName() + " already in group!");
        } else {
            Student [] adds = new Student[groupStudents.length+1];
            System.arraycopy(groupStudents,0,adds,0,groupStudents.length);
            adds[adds.length-1] = student;
            groupStudents = adds;
            checkMax++;
        }
    }

    public void delete(Student student){
        Student[] tempDel = groupStudents;
        Student delStudent = new Student();
        for (int i = 0;i<tempDel.length;i++){
           if(tempDel[i]==student){
               delStudent = tempDel[i];
                tempDel[i] = tempDel[tempDel.length-1];
                tempDel[tempDel.length-1] = delStudent;
                tempDel[tempDel.length-1] = null;
               groupStudents = Arrays.copyOfRange(tempDel,0,tempDel.length-1);
               checkMax--;
           }
        }

    }


    public Student findStudent(String firstName){

        try{
        for (int i =0; i<groupStudents.length;i++){

                if(groupStudents[i].getFirstName() == firstName){
                    return this.groupStudents[i];
                }
            }
        }catch (NullPointerException e){
            System.out.println("Not this student");

        }
        return null;
    }


    private void sortStudent(){
        Arrays.sort(groupStudents,new SortByLastName());
    }

    public void sortStudentByFirstName(){
        Arrays.sort(groupStudents,new SortByFirstName());
        for(Student i: groupStudents){
            System.out.println("Students: " + " Last Name= " + i.getLastName() + " First Name= " + i.getFirstName() + "Univercity= " + i.getUnivercity() + "age= " + i.getAge());
        }
    }

    public void sortStudentByAge(){
        Arrays.sort(groupStudents,new SortByAge());

        for (Student i: groupStudents){
            System.out.println("Students: " + " Last Name= " + i.getLastName() + " First Name= " + i.getFirstName() + "Univercity= " + i.getUnivercity() + "age= " + i.getAge());
        }
    }

    public void sortStudentByUnivercity(){
        Arrays.sort(groupStudents,new SortByUnivercity());
        for (Student i: groupStudents) {
            System.out.println("Students: " + " Last Name= " + i.getLastName() + " First Name= " + i.getFirstName() + "Univercity= " + i.getUnivercity() + "age= " + i.getAge());
        }
    }


    private boolean checkStudent(Student student){
        for (int i = 0; i< groupStudents.length;i++){
            if(groupStudents[i]==student){
                return true;
            }
        }
        return false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Student[] getGroupStudents() {
        return groupStudents;
    }

    @Override
    public String toString() {
        sortStudent();
        return "Group{" +
                "groupStudents:\n" + Arrays.toString(groupStudents) +
                '}';
    }
}
