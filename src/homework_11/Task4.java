package homework_11;


/*
Написать метод, который удаляет все вхождения заданного числа из массива и возвращает новый массив без этого числа.
 */

import lessons.lesson_11.ArraysUtil;



public class Task4 {
    public static void main(String[] args) {

        int[] array = {2, 2, 3, 6, 7, 2};

        int[] res = removeElement(array, 2);

        System.out.println(res.length);
        ArraysUtil.printArray(res);

    }

    public static int[] removeElement(int[] array, int element) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) count++;
        }

        if (count == 0) return array;
//        if (count == array.length) return new int[0];

        int[] result = new int[array.length - count];

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != element) {
                result[index++] = array[i];
            }
        }

        return result;

    }
}
