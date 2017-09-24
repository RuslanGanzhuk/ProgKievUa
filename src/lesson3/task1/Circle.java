package lesson3.task1;

public class Circle extends Shape {

    private Point dotA;
    private Point dotB;

    public Circle(Point dotA, Point dotB) {
        this.dotA = dotA;
        this.dotB = dotB;
    }

    public Circle() {
    }


    @Override
    public double getArea() {
        double area = Math.PI * (getLenghtRadius() * getLenghtRadius());
        return area;
    }

    @Override
    public double getPerimetr() {
        double perimetr = 2 * Math.PI * getLenghtRadius();
        return perimetr;
    }

    private double getLenghtRadius(){
        Point vectorRadius= new Point(dotB.getX()-dotA.getX(),dotB.getY()-dotA.getY());
        double lenghtRadius = Math.sqrt((vectorRadius.getX()*vectorRadius.getX())+(vectorRadius.getY()*vectorRadius.getY()));
        return lenghtRadius;
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
        return "Circle{" +
                "dotA=" + dotA +
                ", dotB=" + dotB +
                '}';
    }
}
