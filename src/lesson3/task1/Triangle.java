package lesson3.task1;

import lesson3.task1.Point;
import lesson3.task1.Shape;

public class Triangle extends Shape {

    private Point dotA;
    private Point dotB;
    private Point dotC;

    public Triangle(Point dotA, Point dotB, Point dotC) {
        this.dotA = dotA;
        this.dotB = dotB;
        this.dotC = dotC;
    }


    public Triangle (){

    }

    @Override
    public double getArea() {

        double area = (((dotA.getX()-dotC.getX())*(dotB.getY()-dotC.getY()))-((dotA.getY()-dotC.getY())*(dotB.getX()-dotC.getX())))/2;

        if (area < 0){
            return area * (-1);
        }
        return area;
    }

    @Override
    public double getPerimetr() {

        Point vectorAB = new Point(dotB.getX()-dotA.getX(),dotB.getY()-dotA.getY());
        Point vectorAC = new Point(dotC.getX()-dotA.getX(),dotC.getY()-dotA.getY());
        Point vectorBC = new Point(dotC.getX()-dotB.getX(),dotC.getY()-dotB.getY());

        double lenghtAB = Math.sqrt((vectorAB.getX()*vectorAB.getX())+(vectorAB.getY()*vectorAB.getY()));
        double lenghtAC = Math.sqrt((vectorAC.getX()*vectorAC.getX())+(vectorAC.getY()*vectorAC.getY()));
        double lenghtBC = Math.sqrt((vectorBC.getX()*vectorBC.getX())+(vectorBC.getY()*vectorBC.getY()));

        return lenghtAB + lenghtAC + lenghtBC;
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

    public Point getDotC() {
        return dotC;
    }

    public void setDotC(Point dotC) {
        this.dotC = dotC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "dotA=" + dotA +
                ", dotB=" + dotB +
                ", dotC=" + dotC +
                '}';
    }
}
