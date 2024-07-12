package homework_40;

/*
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
Используйте несколько предикатов для фильтрации списка чисел,
где числа должны быть четными,
больше 10 и
меньше 100
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 5, 11, 102, 55, 61, 50, 6, 12);

        Predicate<Integer> predicate1 = integer -> integer % 2 == 0; // проверка на четность
        Predicate<Integer> predicate2 = i -> i > 10;
        Predicate<Integer> predicate3 = i -> i < 100;
        Predicate<Integer> combinePredicate = predicate1.and(predicate2).and(predicate3);

        List<Integer> result = filterByPredicate(list, combinePredicate);
        System.out.println(result);


    }

    public static List<Integer> filterByPredicate(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();

        for (Integer value: list) {
            if (predicate.test(value)) {
                result.add(value);
            }
        }

        return result;
    }
}