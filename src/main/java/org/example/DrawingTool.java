package org.example;

import java.util.HashSet;
import java.util.Set;

public class DrawingTool {
    private final Set<Shape> shapes;

    public DrawingTool() {
        this.shapes = new HashSet<>();
    }

    public boolean addShape(Shape shape) {
        // Check for duplicate shapes based on their class type and parameters
        for (Shape existingShape : shapes) {
            if (existingShape.getClass().equals(shape.getClass()) &&
                    existingShape.Perimeter() == shape.Perimeter() &&
                    existingShape.Area() == shape.Area()) {
                return false;
            }
        }

        shapes.add(shape);
        return true;
    }

    public double getTotalPerimeter() {
        double totalPerimeter = 0.0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.Perimeter();
        }

        return totalPerimeter;
    }

    public double getTotalSurface() {
        double totalSurface = 0.0;

        for (Shape shape : shapes) {
            totalSurface += shape.Area();
        }

        return totalSurface;
    }
}