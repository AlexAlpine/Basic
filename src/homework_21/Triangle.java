package homework_21;


public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;


    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        if (!isValidSides()) {
            // Треугольник составить невозможно
            System.out.println("Построить треугольник с такими сторонами невозможно!");
            this.sideA = 3;
            this.sideB = 4;
            this.sideC = 5;
        }
    }

    private boolean isValidSides() {
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
        return "Triangle {" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}