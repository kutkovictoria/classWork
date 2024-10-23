package geometry;

public class Rectangle extends GeometricShape {
    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        shapeType = "rectangle";
    }

    public double getArea() {
        return sideA * 2 + sideB * 2;
    }
}
