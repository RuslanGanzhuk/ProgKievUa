package lesson4.task2;

import lesson4.task1.Group;
import lesson4.task1.Student;

import java.util.Arrays;

public class OficerImplMilitaryAge implements MilitaryAge{

    @Override
    public void checkStudentForArmy(Group group) {
        Student [] listStudentWhoReadyGoToArmy = new Student[group.getGroupStudents().length];
        for (Student i :group.getGroupStudents()) {
            if(i.getAge() >= 18 && i.isSex() == true){
                System.out.println("Student: Last Name: " + i.getLastName() + " First Name: " + i.getFirstName() + " age: " + i.getAge() + " sex: " + i.isSex());
            }

        }


        //       Не смог реализовать чтоб метод возвращал массив, проваливался в ошибку.
        //       Сделал через такой костыль.




//        for(int i = 0; i < group.getGroupStudents().length;i++){
//
//            Student temp = new Student();
//
//            if(group.getGroupStudents()[i].getAge() >= 18 && group.getGroupStudents()[i].isSex() == true ){
//                listStudentWhoReadyGoToArmy[i] = group.getGroupStudents()[i];
//            }

//            for (int j = 0; j < listStudentWhoReadyGoToArmy.length;i++){
//                        if(listStudentWhoReadyGoToArmy[i] == null){
//                            temp =listStudentWhoReadyGoToArmy[i];
//                            listStudentWhoReadyGoToArmy[listStudentWhoReadyGoToArmy.length-1] = temp;
//
//                    listStudentWhoReadyGoToArmy[i] = listStudentWhoReadyGoToArmy[listStudentWhoReadyGoToArmy.length-1];
//                }
//            }


        }
        //return listStudentWhoReadyGoToArmy;
    }

