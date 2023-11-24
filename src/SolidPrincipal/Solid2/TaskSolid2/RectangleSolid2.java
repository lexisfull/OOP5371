package SolidPrincipal.Solid2.TaskSolid2;
// Open-Closed Principle (Принцип открытости-закрытости).
/*
Программные сущности (классы, модули, функции) должны быть открыты для расширения, но не для модификации.
в данном случае это реализовано через интерфейс
 */
interface Shape {
    double calculateArea();
}

public class RectangleSolid2 implements Shape {
    private double width;
    private double height;

    public RectangleSolid2(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    static class AreaCalculator {
        public double calculateArea(RectangleSolid2 rectangle) {
            return rectangle.getWidth() * rectangle.getHeight();
        }
    }
}


