package homework_09;


/*
Task 2
Написать метод, принимающий на вход целое число.

Метод должен вывести на экран 2 в степени этоЧисло

класс Math для нахождения степени числа использовать нельзя ;)
 */
public class Task2 {
    public static void main(String[] args) {

        powTwo(6);

    } // Methods area

    public static void powTwo(int x) {

        boolean isPositive = x >= 0;

//        x = (isPositive) ? x : x *(-1);

        if (!isPositive) x *= -1;


        // 2^x
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= 2;
        }

        if (isPositive) {
            System.out.printf("2 ^ %d = %d\n", x, result);
        } else {
            System.out.printf("2 ^ %d = %.3f\n", x,  (double)1 / result);
        }
    }
}
