package lesson3;

import lesson3.task1.*;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(new Point(1, 3), new Point(2, 4), new Point(5, 6));

        Square square = new Square(new Point(1, 3),new Point(5, 6));

        Circle circle = new Circle(new Point(1, 3),new Point(5, 6));
        Circle circle2 = new Circle(new Point(7, 7),new Point(86, 644));

        Board board = new Board();

//Test operation with board

        board.print();
        board.add(circle);
        //board.print();
        board.add(square);
        board.print();
        //board.add(square);
        //board.print();
       // board.add(triangle);
        //board.print();
        //board.add(square);
       //board.add(square);
        //board.print();
        //System.out.println("after delete");
        board.delete(circle);
        board.print();
       // board.delete(circle2);
       // board.add(circle2);
        //board.print();
        //board.delete(square);
        //board.print();

    }
}
