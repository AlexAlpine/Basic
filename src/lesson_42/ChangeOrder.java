package lesson_42;

import java.util.List;
import java.util.stream.Stream;

public class ChangeOrder {
    // Промежуточные методы для изменения порядка элементов
    // sorted - упорядочивает элемента потока
    // unordered() - указывает, что в потоке не обязательно сохранять порядок
    // В основном он имеет смысл в параллельных потоках

    public static void main(String[] args) {
//        task1();
        task2();
//        task3();
    }

    private static void task3() {
        List<String> strings = List.of("E1", "E2", "E3", "E22");

        Stream<String> stream = strings.stream()

                .filter(string -> {
                    System.out.println("filter: " + string);
                    return string.endsWith("2");
                })
                .map(string -> {
                    System.out.println("map: " + string);
                    return string + "_";
                })
                .sorted((s1, s2) -> {
                    System.out.println("sorted: " + s1 + " : " + s2);
                    return s1.compareTo(s2);
                })
                ;

        stream.forEach(string -> System.out.println("foreach: " + string));

    }


    private static void task1() {
        List<String> strings = List.of("E1", "E2", "E3");

        Stream<String> stream = strings.stream()
                .filter(string -> {
                    System.out.println("filter: " + string);
                    return string.length() <= 2;
                })
                .map(string -> {
                    System.out.println("map: " + string);
                    return "_" + string;
                });
        stream.forEach(string -> System.out.println("foreach: " + string));

    }

    private static void task2() {
        List<String> strings = List.of("E1", "E2", "E3");

        Stream<String> stream = strings.stream()
                .map(string -> {
                    System.out.println("map: " + string);
                    return "_" + string;
                })
                .filter(string -> {
                    System.out.println("filter: " + string);
                    return string.endsWith("2");
                })
                ;

        stream.forEach( str -> System.out.println("foreach: " + str));
    }

}