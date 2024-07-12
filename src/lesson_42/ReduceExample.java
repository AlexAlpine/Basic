package lesson_42;

import java.util.List;
import java.util.Optional;

public class ReduceExample {
    /*
    Optional<T> reduce (BinaryOperator<T> accumulator) - Перегруженная версия без стартового значения.
    Выполняет свертку элементов, возвращая суммированное значение

    T reduce (T identity, BinaryOperator<T> accumulator) -
    Выполняет свертку элементов, возвращая суммированное значение

    BinaryOperator<T> - это функциональный интерфейс, который является спец.формой BiFunction<T, T, T>
    Используется для выполнения операций, где два объекта одного типа объединяются и возвращается объект того типа.

     */
    public static void main(String[] args) {

//        task1();
//        task2();
        task3();

    }

    private static void task3() {
        // Можно использовать для нахождения максимума. Происходит не накопление, а некая замена
        List<String> strings = List.of("Java", "Kotlin", "JS");
        Optional<String> longest = strings.stream().reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);

        System.out.println("longest: " + longest.get());
    }

    private static void task2() {
        List<String> strings = List.of("world", "!", "Java");
        String concat = strings.stream().reduce("Hello", (s1, s2) -> s1 + " " + s2);
        System.out.println(concat);
    }

    private static void task1() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 9);
        // посчитать сумму всех элементов, которые кратны 3

        // 3, 6, 9
        Optional<Integer> sum = integers.stream()
                .filter(i -> i % 3 == 0)
                .reduce((a, b) -> a + b);
        System.out.println(sum.orElse(null));

        Integer sum1 = integers.stream()
                .filter(i -> i % 3 == 0)
                .reduce(0, (a, b) -> a + b);

        System.out.println("sum1: "  + sum1);


    }
}