package homework_36;

/*
Напишите метод, который принимает на вход две реализации интерфейса List.

Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RetainAll {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 3));
        List<Integer> integers2 = new LinkedList<>(List.of(3, 4, 4, 5, 5, 6, 7, 8));

        List<Integer> result = intersection(integers, integers2);
        System.out.println(result);
        System.out.println(intersection(integers2, integers));


    }

    public static <T> List<T> intersection(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>(list1);
        result.retainAll(list2);
        return result;
    }
}
