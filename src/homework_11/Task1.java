package homework_11;

/*
Написать метод, который считает сумму всех элементов в массиве.

Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).
 */

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        array = null;

        System.out.println("sumArray(array): " + sumArray(array));
        System.out.println("averageArray(array): " + averageArray(array));
    }


    public static double averageArray(int[] array) {
        if (array == null) return 0;

        int sum = sumArray(array);

        return (double) sum / array.length;

    }

    public static int sumArray(int[] array) {
        if (array == null) return -2_147_000_000; // Хорошего решения с возвратом значения нет. Надо переделать. Потом

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }
}
