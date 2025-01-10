package org.example;

public class Square implements Shape{
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double Perimeter() {
        return 4 * side;
    }

    @Override
    public double Area() {
        return side * side;
    }

}
