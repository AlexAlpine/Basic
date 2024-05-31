package homework_02;

public class Task4 {
    public static void main(String[] args) {

        double a = 1000;
        double b = 500;
        double amount = a + b;
        int dis = 10;
        double discount = amount * 10 / 100;
        double result = amount - discount;
        System.out.println("Result: " + result);

        System.out.println("Discount: " + discount);

        int sun = 23;
        int mon = 21;
        int tue = 20;
        int wed = 20;
        int thu = 25;
        int fri = 19;
        int sat = 19;
        int averageTemp = (sun + mon + tue + wed + thu + fri + sat) / 7;
        System.out.println("Average Temperature: " + averageTemp);

    }
}
