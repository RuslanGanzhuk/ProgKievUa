package lesson2.task3;

public class OperationOnVector {

    public static void sumVectors(Vector3d a,Vector3d b){
        Vector3d sum = new Vector3d(a.getDotX()+b.getDotX(),a.getDotY()+b.getDotY(),
                a.getDotZ()+b.getDotZ());
        System.out.println("Sum vectors = " + sum);
    }

    public static void scalarProduct(Vector3d a, Vector3d b){

        double productVectors = (a.getDotX()*b.getDotX())+(a.getDotY()*b.getDotY())
                +(a.getDotZ()*b.getDotZ());
        System.out.println("Scalar product vectors = " + productVectors);

    }

    public static void dotProductOfVectors(Vector3d a, Vector3d b){

        Vector3d dotProduct = new Vector3d((a.getDotY()*b.getDotZ())-(a.getDotZ()*b.getDotY()),
                (a.getDotZ()*b.getDotX())-(a.getDotX()*b.getDotZ()),
                (a.getDotX()*b.getDotY())-(a.getDotY()*b.getDotX()));

        System.out.println("Dot product vectors = " + dotProduct);

    }
}
