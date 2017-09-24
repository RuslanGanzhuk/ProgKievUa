package lesson3.task1;

import java.util.Arrays;

public class Board {

    private Shape[] partBoard = new Shape[4];
    private int copasity = 0;

    public void add(Shape shape){
        for (int i = 0; i < partBoard.length;i++){
            if(copasity==4){
                System.out.println("Board is full...");
                break;
            }
            if(partBoard[i] == null){
                partBoard[i] = shape;
                copasity++;
                break;
            }
        }
    }

    public void delete(Shape shape){
        int temp = copasity;
        for(int i = 0; i < partBoard.length;i++){
            if (partBoard[i] == shape){
                partBoard[i] = null;
                copasity--;
           }
        }
        if (temp == copasity){
            System.out.println("This shape absent");
        }
    }

    public void print(){
        System.out.println("Shape on the board now : " + copasity);
        System.out.println("There are : "+ Arrays.toString(partBoard));
        System.out.println("Total area = " + totalArea());
    }

    private double totalArea(){
        double totalArea = 0;
        for (int i = 0; i < partBoard.length;i++){
            if (partBoard[i] != null){
                totalArea += partBoard[i].getArea();
            }
        }
        return totalArea;
    }
}
