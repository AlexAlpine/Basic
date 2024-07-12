package lesson_41;

import lesson_40.Cat;

import java.util.List;
import java.util.stream.Collectors;

public class DataFilters {

    public static void main(String[] args) {

//        task();
//        task1();
        task2();


    }

    private static void task2() {
        List<String> strings = List.of("aa", "bb", "ccc", "dd", "eee");

        List<String> strings1 = strings.stream()
                .takeWhile(str -> str.length() < 3)
                .collect(Collectors.toList());
        System.out.println("taheWhile" + strings1);






    }

    private static void task1() {

        List<Integer> integers = List.of(0, 5, 1, 4, 4, 3, 6, 66, 44);
        List<Integer> smallest = integers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("smallest" + smallest);

        List<Integer> integerList = integers.stream()
                .sorted()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println("integerList: " + integerList);

    }

    private static void task() {

        List<Integer> integers = List.of(0, 5, 1, 2, 4, 3, 4, 3, 6, 0, 1);


        integers.stream()
                .distinct()
                .forEach(i -> System.out.print(i + "; ") );

        List<Cat> cats = List.of(
                new  Cat("Bear", 5, "braun"),
        new Cat("Python", 7, "white"),
        new Cat("Tiger", 3, "gray"),
        new Cat("Panda", 4, "black")
        );

        List<Cat> catList = cats.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(catList);

        List<String> strings = List.of("abc", new String("abc"), "defg", "defg");
        System.out.println(strings.stream().distinct().collect(Collectors.toList()));




    }

}
