package geometry;

public class Circle extends GeometricShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        shapeType = "circle";
    }

    public double getArea(){
        return Math.PI * (Math.pow(radius,2));
    }
}
