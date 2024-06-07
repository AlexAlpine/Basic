package lessons.Lesson_17;


import lessons.lesson_15.MagicArray;

import java.util.Arrays;

public class MagicArrTest {
    public static void main(String[] args) {

        int[] testArr = {1, 10, 55, 10, -100, 10, -5, 34};

        MagicArray mArray = new MagicArray(testArr);


        System.out.println(mArray.toString());

        System.out.println(mArray.indexOf(100));

        System.out.println("mArray.removeByValue(10): " + mArray.removeByValue(10));

        System.out.println(mArray.toString());

        System.out.println("mArray.removeByValue(1000): " + mArray.removeByValue(1000));

        int[] outputArray = mArray.toArray();

        System.out.println(outputArray.length);
        System.out.println(Arrays.toString(outputArray));

        System.out.println(mArray.set(15, 1000));

        System.out.println(mArray.set(4, 1000));
        System.out.println(mArray);

        System.out.println(FinalDemo.PI);
        String[] colors = FinalDemo.colors;
        System.out.println(Arrays.toString(colors));


    }
}
