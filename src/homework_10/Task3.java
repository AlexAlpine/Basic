package homework_10;

/*
Task 3
Написать метод, принимающий на вход массив целых чисел.

Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве
 */

public class Task3 {
    public static void main(String[] args) {
        int[] array = {0, 13, -25, 11, 31, 55, 98, 11, 5}; // {11,7,13,0,0,0,0,0} + counter = 3

        int[] simpleDigits = getSimpleDigitsArray(array);

        printArray(simpleDigits);

        printArray(getSimpleDigitsArrayOption2(array));


    }

    public static int[] getSimpleDigitsArrayOption2(int[] array) {
        /*
        1. Посчитать количество простых чисел
        2. Создать массив дл записи
        3. Еще раз перебрать массив и записать простые числа
        4. Вернуть результат
         */

        int[] result = new int[array.length];

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                result[counter] = array[i];
                counter++;
            }
        }

        result = copyOfArray(result, counter);

        return result;

    }

    public static int[] getSimpleDigitsArray(int[] array) {
        /*
        1. Посчитать количество простых чисел
        2. Создать массив дл записи
        3. Еще раз перебрать массив и записать простые числа
        4. Вернуть результат
         */

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                counter++;
            }
        }

        int[] result = new int[counter];

        if (counter == 0) return result;

        counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                result[counter++] = array[i];
            }
        }

        return result;

    }

    public static boolean isPrime(int num) {

        if (num < 2) return false; // не является простым. Проверяем следующее

        if (num == 2 || num == 3) {
            // число простое. Переходим к след. (но надо посчитать его и распечатать)
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int j = 5; j <= Math.sqrt(num); j = j + 6) {
            if (num % j == 0 || num % (j + 2) == 0) {
                return false;
            }
        }

        return true;

    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((i < arr.length - 1) ? ", " : "]\n"));
        }
        if (arr.length == 0) System.out.println("]");
    }

    public static int[] copyOfArray(int[] array, int newLength) {
        int[] result = new int[newLength];  //
        /*
        числовые -> 0/0.0
        boolean -> false
        ссылочных (в т.ч.String) -> null
         */
        for (int i = 0; i < result.length && i < array.length; i++) {
            result[i] = array[i];
        }

        return result;

    }
}
