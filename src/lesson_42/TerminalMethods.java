package lesson_42;


import java.util.List;
import java.util.Optional;

public class TerminalMethods {
    /*
    Терминальные методы, которые возвращают одно значение

    boolean allMatch(Predicate<T> predicate)
    возвращает true, если все элементы потока соответствуют заданному предикату

    boolean anyMatch(Predicate<T> predicate)
    возвращает true, если хотя бы один элемент потока соответствуют заданному предикату

    boolean noneMatch(Predicate<T> predicate)
    возвращает true, если ни один элемент потока не соответствуют заданному предикату

    Optional<T> findFirst() - возвращает первый элемент потока
    Optional<T> findAny() - возвращает произвольный элемент потока

    long count() - Возвращает количество элементов в потоке

    Optional<T> min(Comparator<? super T> comparator) - возвращает минимальный элемент в соответствии с предоставленным компаратором
    Optional<T> max(Comparator<? super T> comparator) - возвращает максимальный элемент в соответствии с предоставленным компаратором




     */

    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
        task4();
    }

    private static void task4() {
        // посчитать все четные элементы в потоке
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        long count = integers.stream()
                .filter(i -> i % 2 ==0)
                .count();

        System.out.println("count: " + count);
    }

    private static void task3() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        Optional<Integer> findFirst = integers.stream().findFirst();
        System.out.println("findFirst: " + findFirst.orElse(null));

        Optional<Integer> findAny = integers.stream().findAny();
        System.out.println("findAny: " + findAny.get());
    }

    private static void task2() {
        List<Integer> integers = List.of(1, 4, 5, -5, 10, 15, 17, 22, 33, 34, 44, 66, 88);

        // anyMatch
        boolean isAnyMatch = integers.stream()
                .filter(i -> i > 10)
                .peek(i -> System.out.print(i + ", "))
                .anyMatch(i -> i % 2 == 0);

        System.out.println("\nisAnyMatch: " + isAnyMatch);

        //noneMatch
        boolean isNonMatch = integers.stream()
                .filter(i -> i > 10)
                .peek(i -> System.out.print(i + ", "))
                .noneMatch(i -> i > 100);

        System.out.println("\nisNonMatch: " + isNonMatch);


    }

    private static void task1() {
        List<Integer> integers = List.of(1, 4, 5, -5, 10, 15, 17, 22, 33, 34, 44, 66, 88);

        // оставить в потоке элементы больше 10 и проверить, что в потоке остались только четные числа.
        boolean isAllMatch = integers.stream()
                .filter(i -> i > 10)
                .peek(i -> System.out.print(i + ", "))
                .allMatch(i -> i % 2 == 0);

        System.out.println("\nisAllMatch: " + isAllMatch);


    }
}