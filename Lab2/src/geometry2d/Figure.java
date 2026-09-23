package geometry2d;

import exceptions.Negative;

public interface Figure {
    double area() throws Negative;
    double perimeter() throws Negative;
}