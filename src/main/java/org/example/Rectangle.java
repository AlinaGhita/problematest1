package org.example;

public class Rectangle implements Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double Perimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double Area() {
        return length * width;
    }
}
