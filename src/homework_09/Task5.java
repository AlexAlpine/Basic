package homework_09;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {

        int[] array = new int[15];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void printArray(int[] data) {
        System.out.println("[");
        for (int i = data.length - 1; i >= 0; i--) {
            if (i !=data.length -1) {
                System.out.println(", ");
            }
            System.out.println(data[i]);
        }
    }
}
