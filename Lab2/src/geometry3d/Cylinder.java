package geometry3d;

import geometry2d.Figure;
import exceptions.Negative;
import exceptions.ZeroHeightException;

public class Cylinder {
    private Figure base;      // основание (любая Figure)
    private double height;    // высота

    public Cylinder(Figure base, double height)
            throws ZeroHeightException, Negative {
        if (height <= 0) {
            throw new ZeroHeightException("Высота должна быть > 0: " + height);
        }
        this.base = base;
        this.height = height;
    }

    public double volume() throws Negative {
        return base.area() * height;
    }

    @Override
    public String toString() {
        return "Цилиндр [основание = " + base + ", высота = " + height + "]";
    }
}