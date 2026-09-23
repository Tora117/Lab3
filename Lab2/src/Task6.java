import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry2d.Figure;
import geometry3d.Cylinder;
import exceptions.Negative;
import exceptions.ZeroHeightException;

public class Task6 {
    public static void main(String[] args) {
        try {
            Circle circle = new Circle(5);
            Rectangle rect = new Rectangle(4, 6);

            System.out.println(circle);
            System.out.println("  Площадь = " + circle.area());
            System.out.println("  Периметр = " + circle.perimeter());

            System.out.println(rect);
            System.out.println("  Площадь = " + rect.area());
            System.out.println("  Периметр = " + rect.perimeter());

            Cylinder cyl1 = new Cylinder(circle, 10);
            System.out.println(cyl1);
            System.out.println("  Объём = " + cyl1.volume());

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}