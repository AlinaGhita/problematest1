package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    void testRectangle() {
        Rectangle rectangle = new Rectangle(7, 5);
        assertEquals(24, rectangle.Perimeter());
        assertEquals(35, rectangle.Area());
    }

    @Test
    void testSquare() {
        Square square = new Square(8);
        assertEquals(32, square.Perimeter());
        assertEquals(64, square.Area());
    }

    @Test
    void testCircle() {
        Circle circle = new Circle(3);
        final double PI = 3.14;
        assertEquals(2 * PI * 3, circle.Perimeter(), 0.0001);
        assertEquals(PI * 3 * 3, circle.Area(), 0.0001);
    }

    @Test
    void testTriangle() {
        Triangle triangle = new Triangle(4,5,6);
        assertEquals(15, triangle.Perimeter());
        assertEquals(9.9215, triangle.Area(), 0.0001);
    }

    @Test
    void testDrawingTool(){
        Rectangle rectangle = new Rectangle(7, 5);
        Square square = new Square(8);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5,6);

        DrawingTool drawingTool = new DrawingTool();
        drawingTool.addShape(rectangle);
        drawingTool.addShape(square);
        drawingTool.addShape(circle);
        drawingTool.addShape(triangle);

        assertEquals(89.84, drawingTool.getTotalPerimeter(), 0.0001);
        assertEquals(137.1815, drawingTool.getTotalArea(), 0.0001);
    }
}
