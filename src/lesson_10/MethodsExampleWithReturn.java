package lesson_10;

public class MethodsExampleWithReturn {
    public static void main(String[] args) {

        int sum = 10 + 5;
        int sum1 = calculateSum(10, 5);

        System.out.println("sum1: " + sum1);

        sum = calculateSum(5,5) + calculateSum(10, 20);
        System.out.println(sum);

        System.out.println(powTwo(-4));

        double pow = powTwo(-6);
        System.out.println(pow);


        int square = squareNumber(-2);
        System.out.println(square);

        double sq1 = squareNumber(1.5);
        System.out.println(sq1);

        int[] ints = {555, -1, 43, 0, 10, 3443,  100, 555, 44};

        int minIndex = minIndexArray(ints);

        if (minIndex != -1) {
            System.out.println("Найден минимум: " + ints[minIndex] + " | индекс: " + minIndex);
        } else {
            System.out.println("Минимум не найден!!! ");
        }

        System.out.println(isNumberInArray(ints, 555));
        System.out.println(isNumberInArray(ints, 777));

        System.out.println(searchNumber(ints, 777));

        int index = searchNumber(ints, 555);

        System.out.println("index: " + index);
        System.out.println((index >= 0) ? ints[index] : "Число не найдено");
        // {}
    } // Methods area

    // Написать метод поиска целого числа в массиве int
    // Что принимает метод, -
    // что возвращает? boolean / индекс числа
    // Если число присутствует?
    // а если числа нет - что вернуть? -> -1

    public static boolean isNumberInArray(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) return true;
        }
        return false;
    }

    public static int searchNumber(int[] array, int number) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) return i;
        }

        return -1;
    }



    // Написать метод поиска минимального значения в массиве
    public static int minIndexArray(int[] ints) {
        if (ints == null || ints.length == 0) return -1;

        int min = ints[0];
        int idx = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
                idx = i;
            }
        }

        return idx;
    }


    public static double squareNumber(double number) {
        return number * number;
    }


    // Напишите метод, который вычисляет и возвращает квадрат числа.
    public static int squareNumber(int number) {
        int result = number * number;
        return result;
    }


    public static int calculateSum(int a, int b) { // значение возвращается в место вызова метода
        int result = a + b;
        return result;
    }

    public static double powTwo(int x) {

        boolean isPositive = x >= 0;

        if (!isPositive) x *= -1;


        // 2^x
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= 2;
        }

        if (isPositive) {
            return result;
        } else {
            return (double) 1 / result;
        }


    }


}
