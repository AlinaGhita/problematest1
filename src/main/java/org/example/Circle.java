package org.example;

public class Circle implements Shape {
    private final double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double Perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double Area() {
        return PI * radius * radius;
    }
}
