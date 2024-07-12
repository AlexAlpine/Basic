package lesson_41;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataChanges {

    public static void main(String[] args) {

//        task();
//        task1();
//        task2();
        task3();
    }

    private static void task3() {
        String[] strs = {"aaa", "bbbb", "cccc"};
        List<Integer> integers = Arrays.stream(strs)
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(integers);

        int[] ints = Arrays.stream(strs)
                .mapToInt(String::length)
                .toArray();

        System.out.println(Arrays.toString(ints));


    }

    private static void task2() {

        int[] ints = new int[]{1, 2, 3, 4, 5, 6};
        List<Integer> integers = Arrays.stream(ints)
                .boxed()
            //    .mapToObj(i -> i)
           //     .mapToObj(i -> Integer.valueOf(i))
                .collect(Collectors.toList());

        System.out.println(integers);

    }

    private static void task1() {

        String[] strings = {"ABC", "def", "qwerty", "XyZ"};
        String s = "ewewwe";

        List<Character> characterList = Arrays.stream(strings)
                .flatMapToInt(str -> str.chars())
                .peek(e -> System.out.print("e: " + e + ", "))
                .mapToObj(i -> (char) i)
                .collect(Collectors.toList());
        System.out.println();
        System.out.println("characterList" + characterList);

    }

    private static void task() {

        Shop shop = new Shop("Shop1", List.of("Orange", "Banana", "Apple"));
        Shop shop1 = new Shop("Shop1", List.of("Lime", "Cherry", "Pineapple"));
        Shop shop2 = new Shop("Shop1", List.of("Graphe", "Lemon", "Apple"));

        Shop[] shops = new Shop[] {shop, shop1, shop2};

        List<String> products = Arrays.stream(shops)
                .flatMap(shopCurrent -> shopCurrent.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(products);


    }

}
