package org.example;

class App
{
    public static void main( String[] args )
    {

        Rectangle rectangle = new Rectangle(4, 5);
        Square square = new Square(4);
        Circle circle = new Circle(3);


        DrawingTool drawingTool = new DrawingTool();

        drawingTool.addShape(rectangle);
        drawingTool.addShape(square);
        drawingTool.addShape(circle);
        drawingTool.addShape(rectangle);

        if (!drawingTool.addShape(rectangle)) {
            System.out.println("This shape already exists.");
        }

        double totalPerimeter = drawingTool.getTotalPerimeter();
        double totalSurface = drawingTool.getTotalSurface();

        System.out.println("Total Perimeter: " + totalPerimeter);
        System.out.println("Total Surface: " + totalSurface);
    }
}


