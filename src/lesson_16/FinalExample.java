package lesson_16;

import java.util.Arrays;

public class FinalExample {
    // после инициализации (присвоения первого значения) - изменить значение в переменной нельзя
    private final int capacity;
    private final int[] ints ;

    public FinalExample(int capacity) {
        this.capacity = capacity;
        // нельзя поменять значение
//        this.capacity = capacity * 2;

        ints = new int[10];


    }

    public static void main(String[] args) {
        FinalExample finalExample = new FinalExample(10);

        finalExample.ints[1] = 100;
        finalExample.ints[4] = -500;

        System.out.println(Arrays.toString(finalExample.ints));
    }
}

