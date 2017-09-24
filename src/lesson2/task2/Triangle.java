package lesson2.task2;

public class Triangle {

    private double partA;
    private double partB;
    private double partC;

    public Triangle(double partA, double partB, double partC) {
        this.partA = partA;
        this.partB = partB;
        this.partC = partC;
    }

    public Triangle() {
    }

    public double getPartA() {
        return partA;
    }

    public void setPartA(double partA) {
        this.partA = partA;
    }

    public double getPartB() {
        return partB;
    }

    public void setPartB(double partB) {
        this.partB = partB;
    }

    public double getPartC() {
        return partC;
    }

    public void setPartC(double partC) {
        this.partC = partC;
    }

    public double areaTriangle(){
        return areaTriangle(this);
    }

    public double areaTriangle(Triangle triangle){

        //Формула Герона

        double halfPerimetr = (triangle.getPartA()+triangle.getPartB()+triangle.getPartC()) / 2;

        double areaTriangle = Math.sqrt(halfPerimetr*(halfPerimetr-triangle.getPartA())
                *(halfPerimetr-triangle.getPartB())*(halfPerimetr-triangle.getPartC()));

        return areaTriangle;

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "partA=" + partA +
                ", partB=" + partB +
                ", partC=" + partC +
                '}';
    }
}
