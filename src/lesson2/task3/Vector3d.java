package lesson2.task3;

public class Vector3d {

    private double dotX;
    private double dotY;
    private double dotZ;


    public Vector3d(double dotX, double dotY, double dotZ) {
        this.dotX = dotX;
        this.dotY = dotY;
        this.dotZ = dotZ;
    }

    public Vector3d(){
    }

    public double getDotX() {
        return dotX;
    }

    public void setDotX(double dotX) {
        this.dotX = dotX;
    }

    public double getDotY() {
        return dotY;
    }

    public void setDotY(double dotY) {
        this.dotY = dotY;
    }

    public double getDotZ() {
        return dotZ;
    }

    public void setDotZ(double dotZ) {
        this.dotZ = dotZ;
    }

    @Override
    public String toString() {
        return "Vector3d{" +
                "dotX=" + dotX +
                ", dotY=" + dotY +
                ", dotZ=" + dotZ +
                '}';
    }
}
