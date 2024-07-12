package lesson_41;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiInterfaces {

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (str1, str2) -> System.out.println(str1 + " : " + str2);
        biConsumer.accept("Hello", "Java");

        BiPredicate<Integer,Integer> biPredicate = (a, b) -> a > b;
        System.out.println("te.test(10, 20)" + biPredicate.test(10, 20));

        BiFunction<String, String, Integer> biFunction = (s1, s2) -> s1.length() + s2.length();
        System.out.println("biFunction.apply: " + biFunction.apply("One", "Two"));


    }

}
