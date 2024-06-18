package lesson_24.generics;


import homework_23.list.MagicList;
import lesson_24.generics.Util;

import java.util.Arrays;

public class MethodsApp {
    public static void main(String[] args) {
        Integer[] integers = {0, 1, 2, 3, 4, 5, 6, 7};
        String[] strings = {"Hello", "Java", "Python", "JS"};

        Util.swap(integers, 2, 5);
        System.out.println(Arrays.toString(integers));

        Util.swap(strings, 0, 2);
        System.out.println(Arrays.toString(strings));

        int sum = Util.sum(1, 2, 3, 4);
        System.out.println(sum);

        System.out.println(Util.sum(1.5, 2.5, 3.5));

        MagicList<Double> doubleMagicList = new MagicList<>(new Double[]{1.5, 2.5, 3.5});

        double sumD = Util.listSum(doubleMagicList);

        MagicList<Integer> integerMagicList = new MagicList<>(new Integer[]{1,3,4,5,6});
        Util.listSum(integerMagicList);

        Util.addNumbers(integerMagicList);

        System.out.println(integerMagicList);


        MagicList<Double> doubleMagicList1 = new MagicList<>(new Double[]{1.5, 2.5, 3.5});


    }
}
