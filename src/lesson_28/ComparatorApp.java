package lesson_28;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {

    public static void main(String[] args) {

        int[] ints = new int[]{9, 5, 1, 2, 3, 0, 4};
        String[] strings = {"Abbb", "Cccc", "Bbbb", "Zebra", "apple"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));


        Car[] cars = new Car[4];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 250);
        cars[3] = new Car("Ferrari", 2023, 300);

        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars);

        System.out.println(Arrays.toString(cars));

        System.out.println("\n carSpeedComparator ==========================\n");

        CarSpeedComparator carSpeedComparator = new CarSpeedComparator();

        Arrays.sort(cars, carSpeedComparator);
        System.out.println(Arrays.toString(cars));

        CarModelComparator carModelComparator = new CarModelComparator();

        Arrays.sort(cars, carModelComparator);
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getMaxSpeed, Comparator.reverseOrder()));

        System.out.println(Arrays.toString(cars));


    }

}
