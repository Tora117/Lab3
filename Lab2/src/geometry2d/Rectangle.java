package geometry2d;
import exceptions.Negative;

public class Rectangle implements Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) throws Negative {
        if (width < 0 || height < 0) {
            throw new Negative("Стороны не могут быть отрицательными: "
                    + width + ", " + height);
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Прямоугольник (ширина = " + width + ", высота = " + height + ")";
    }
}