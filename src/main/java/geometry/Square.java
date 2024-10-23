package geometry;

public class Square extends GeometricShape{
    double sideLength;

    public Square(double sideLenght) {
        this.sideLength = sideLenght;
        shapeType = "square";
    }

    public double getArea(){
        return sideLength * sideLength;
    }
}
