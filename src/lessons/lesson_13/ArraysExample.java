package lessons.lesson_13;


import java.util.Arrays;
import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {

        int[] array = {3, 2, 1, 0};

        // Возвращает строковое представление массива (String)
        String arrayToString = Arrays.toString(array);

        System.out.println(arrayToString);

        System.out.println(Arrays.toString(array));

        // Сортируем указанный массив
        Arrays.sort(array);
//        Arrays.sort(array, 1, 3);

        System.out.println(Arrays.toString(array));

        // binarySearch - бинарный поиск (массив должен быть отсортирован)
        int index = Arrays.binarySearch(array, 3);
        System.out.println("index: " + index);

        // Метод проверяет равна ли два массива
        int[] test = {0, 1, 3, 2};
        boolean isArraysEquals = Arrays.equals(array, test);
        System.out.println("isArraysEquals: " + isArraysEquals);

        // Находит и возвращает индекс первого различия между массивами
        int mismatchIndex = Arrays.mismatch(array, test);
        System.out.println("mismatchIndex: " + mismatchIndex);

        // Возвращает строковое представление массива, включая вложенные массивы
        int[][] arrayD = new int[3][4];
        System.out.println(Arrays.deepToString(arrayD));

        // для сравнения многомерных массивов
        int[][] arrayC = new int[3][4];
        arrayC[2][3] = 1;
        boolean isEquals = Arrays.deepEquals(arrayC, arrayD);
        System.out.println("isEquals: " + isEquals);

        // copyOf - Метод копирует массив или его часть в новый массив
        int[] copyOfTest = Arrays.copyOf(test, 10);
        System.out.println(Arrays.toString(copyOfTest));
        System.out.println(Arrays.toString(Arrays.copyOf(test, 2)));

        //заполнение массива значением
        int[] arr = new int[5];
        Arrays.fill(arr, 10);
        Arrays.fill(arr, 2, 5, 1000);
        Arrays.fill(arr,  generateRandom());
        System.out.println(Arrays.toString(arr));


    }

    private static int generateRandom() {
        Random random = new Random();
        System.out.println("Метод генерации значения");
        int res = random.nextInt(101);

        return res;
    }
}