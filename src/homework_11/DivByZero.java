package homework_11;

public class DivByZero {
    public static void main(String[] args) {


        int a = 10;
//        System.out.println(a / 0); //ArithmeticException: / by zero

        double b = 10.0;
        System.out.println(b / 0); // Infinity - бесконечность

        double inf = b / 0;
        double inf1 = b / 0;

        System.out.println( 0.0 / 0); //NaN - значение не определено


    }
}
