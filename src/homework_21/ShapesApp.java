package homework_21;


import homework_21.Circle;
import homework_21.Triangle;
import homework_21.TriangleSingle;

public class ShapesApp {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(3,4, 10);

        System.out.println(triangle);

        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(5, 7, 9);
        shapes[1] = new Circle(5.5);
        shapes[2] = new Rectangle(10, 20);

        double sumArea = 0;
        double sumPerimeters = 0;

        for (int i = 0; i < shapes.length; i++) {
            System.out.print(shapes[i].getClass().getName() + " площадь: " + shapes[i].area());
            System.out.println("; периметр: " + shapes[i].perimeter());
            sumArea += shapes[i].area();
            sumPerimeters += shapes[i].perimeter();
        }

        System.out.printf("Сумма площадей %.2f\n", sumArea);
        System.out.printf("Сумма периметров %.2f\n", sumPerimeters);

        TriangleSingle triangleSingle = TriangleSingle.getInstance(3, 4, 5);
        System.out.println(triangleSingle);

        System.out.println(triangleSingle.area());
        System.out.println(triangleSingle.perimeter());

    }
}