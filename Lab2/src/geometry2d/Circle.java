package geometry2d;

import exceptions.Negative;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) throws Negative {
        if (radius < 0) {
            throw new Negative("Радиус не может быть отрицательным: " + radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Круг радиус = " + radius;
    }
}