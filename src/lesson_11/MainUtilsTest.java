package lesson_11;

import lesson_11.ArraysUtil;

import java.util.Arrays;

public class MainUtilsTest {
    public static void main(String[] args) {

        int[] ints = {25, 11, 53, 16, 25, 14, 25, 11, 53, -8, 77, 0};

        ArraysUtil.sortArray(ints);

        ArraysUtil.printArray(ints);

        System.out.println(ArraysUtil.linearSearch(ints, 77));
        System.out.println(ArraysUtil.linearSearch(ints, 100));

        int[] testInts = ArraysUtil.fillTestArray(1_000_000);

//        ArraysUtil.sortArray(testInts);
        Arrays.sort(testInts);
        System.out.println("Sort done");

        System.out.println(ArraysUtil.binarySearch(ints, 100));

        System.out.println(ArraysUtil.binarySearch(testInts, 2000));
        System.out.println(ArraysUtil.linearSearch(testInts, 2000));

    }
}
