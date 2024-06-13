package lesson_11;


import java.util.Random;

public class ArraysUtil {

    public static void main(String[] args) {

    } // Method Area

    public static int binarySearch(int[] array, int value) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        int middleIndex;

        int counter = 0;
        // проверить можно ли разделить массив
        while (startIndex <= endIndex) {
            counter++;
            // вычисляю середину
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            // сравниваю значения "в середине" с искомым
            if (array[middleIndex] == value) {
                System.out.println("Число найдено. Шагов: " + counter);
                return middleIndex;
            }

            // надо понять, в какой части массива может быть искомое число (слева или справа от середины?)
            // смещаем соответствующие указатели
            if (array[middleIndex] > value) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }

        }
        System.out.println("Число НЕ найдено: " + counter);
        return  -1;
    }

    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }


    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // находим индекс мин значения в части массива

            int minIndex = minIndexSearch(array, i);

            // swap - меняем местами значение самого левого элемента (i) и элемента с minIndex
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

        }

    }

    public static int minIndexSearch(int[] array, int startIndex) {
        int min = array[startIndex];
        int minIdx = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static void printArray(int[] ints) {
        if (ints == null) {
            System.out.println("null");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ((i < ints.length - 1) ? ", " : "]\n"));
        }
        if (ints.length == 0) System.out.println("]");
    }

    public static int[] fillTestArray(int size) {
        int[] result = new int[size];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(2001) - 1000; // -1000...1000
        }
        return result;
    }

}
