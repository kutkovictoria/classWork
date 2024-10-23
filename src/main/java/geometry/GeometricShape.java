package geometry;

public abstract class GeometricShape {

    protected String shapeType;
    public abstract double getArea();
    public void printShapeInfo() {
        System.out.println("Hi, I am a " + shapeType);
    }
}
