package homework_41;

/*
Имеется список целых чисел.

Необходимо отфильтровать этот список, оставив только чётные числа,
затем каждое число умножить на 2, и собрать результат в новый список
 */

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(2, 1, 4, -4, 5, 0,  8, 11, 12, 15, 22);

        List<Integer> collect = integers.stream()
                .filter(i -> i % 2 == 0)
                .filter(i -> i != 0)
                .map(i -> i * 2)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}