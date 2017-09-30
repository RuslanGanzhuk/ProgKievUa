package lesson4.task1;

import java.util.Arrays;

public class Group {

    private int copasity = 10;
    private int checkMax;
    private Student[] groupStudents = new Student[checkMax];

    public void add(Student student) throws MyException {
        if(copasity == checkMax){
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


    private boolean checkStudent(Student student){
        for (int i = 0; i< groupStudents.length;i++){
            if(groupStudents[i]==student){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        sortStudent();
        return "Group{" +
                "groupStudents:\n" + Arrays.toString(groupStudents) +
                '}';
    }
}
