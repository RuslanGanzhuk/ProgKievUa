package lesson3.task1;

import lesson3.task1.Point;
import lesson3.task1.Shape;

public class Square extends Shape {

    private Point dotA;
    private Point dotB;

    public Square(Point dotA, Point dotB) {
        this.dotA = dotA;
        this.dotB = dotB;
    }

    public Square(){

    }

    @Override
    public double getArea() {

        return getLenghtSide()*getLenghtSide();
    }

    @Override
    public double getPerimetr() {
        return getLenghtSide() * 4;
    }

    private double getLenghtSide(){
        Point vectorSide= new Point(dotB.getX()-dotA.getX(),dotB.getY()-dotA.getY());
        double lenghtAB = Math.sqrt((vectorSide.getX()*vectorSide.getX())+(vectorSide.getY()*vectorSide.getY()));
        return lenghtAB;
    }

    public Point getDotA() {
        return dotA;
    }

    public void setDotA(Point dotA) {
        this.dotA = dotA;
    }

    public Point getDotB() {
        return dotB;
    }

    public void setDotB(Point dotB) {
        this.dotB = dotB;
    }

    @Override
    public String toString() {
        return "Square{" +
                "dotA=" + dotA +
                ", dotB=" + dotB +
                '}';
    }
}
