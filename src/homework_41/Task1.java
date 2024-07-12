package homework_41;

/*
Task 1
Из списка целых чисел выделите те значения, которые больше 10;
отсортируйте эти значения по значению последней цифры в числе
и выведите результат на экране
 */

import java.util.Comparator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(9, 17, 11, 22, 5, 34, 55, 101, 204);

        integers.stream()
                .filter(i -> i > 10)
                .sorted(Comparator.comparing(i -> i % 10))
//                .sorted((i1, i2) -> (i1 % 10) - (i2 % 10))
                .forEach(i -> System.out.print(i + ", "));
        System.out.println();
    }
}