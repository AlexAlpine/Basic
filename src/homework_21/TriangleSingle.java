package homework_21;


public class TriangleSingle extends Shape{

    private double sideA;
    private double sideB;
    private double sideC;


    private static TriangleSingle instance;

    private TriangleSingle() {

    }

    private TriangleSingle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public static TriangleSingle getInstance(double sideA, double sideB, double sideC) {

        if (isValidSides(sideA, sideB, sideC)) {
            instance = new TriangleSingle(sideA, sideB, sideC);
        } else {
            instance = null;
            System.out.println("Треугольник не может быть составлен!");
        }
        return instance;
    }


    private static boolean isValidSides(double sideA, double sideB, double sideC) {
        return sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB;
    }

    @Override
    public double area() {
        // sqrt (p2 * (p2 - s1) * (p2-s2) * (p2-s3))
        double p2 = perimeter() / 2;
        double ares = Math.sqrt( p2 * (p2 - sideA) * (p2 - sideB) * (p2 - sideC));

        return ares;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return "TriangleSingle {" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}