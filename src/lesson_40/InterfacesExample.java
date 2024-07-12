package lesson_40;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class InterfacesExample {
    public static void main(String[] args) {
        // Consumer<T> - выполняет операцию над объектом типа Т, не возвращая никакого результат
        // void accept(T t)

        Consumer<String> example = new Consumer<String>() {
            @Override
            public void accept(String str) {

            }
        };

        Consumer<String> printConsumer = str -> System.out.println(str + "!!!");
        printConsumer.accept("Hello world");
        printConsumer.accept("Java");

        // составной интерфейс
        Consumer<String> consumer1 = str -> System.out.println("1. " + str.length());
        Consumer<String> consumer2 = string -> System.out.println("2. " + string + "!");

        Consumer<String> resultConsumer = consumer1.andThen(consumer2);
        resultConsumer.accept("Test");


        // boolean Predicate<T> - функция, которая принимает объект типа T
        // и возвращает булевое значение. Проверка объекта на соответствие условию.
        // and() - логическое И (AND)
        // or() - логическое ИЛИ (OR)
        // negate() - логическое отрицание НЕТ (NOT)

        // boolean test(T t) - основной (абстрактный) метод
        Predicate<String> stringPredicate = new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return false;
            }
        };

        Predicate<String> isNotEmpty = str -> !str.isEmpty();
        boolean result = isNotEmpty.test("Hello, World");
        System.out.println("otEmpty.test(null): " + isNotEmpty.test(""));
        System.out.println("isNotEmpty.test(\"Hello, World\"): " + result);

        List<Integer> list = new ArrayList<>(List.of(-1, 3, 4, 0, 34, -45, 11, 45));

        // список всех отрицательных элементов
        List<Integer> res1 = filterListByPredicate(list, i -> i < 0);
        System.out.println(res1);

        // список всех четных элементов
        List<Integer> res2 = filterListByPredicate(list, n -> n !=0 && n % 2 == 0);
        System.out.println(res2);

        System.out.println("\n ========================= \n");

        // and(Predicate<T> other) - логическое И
        Predicate<String> isLengthGreat6 = str -> str.length() > 6;
        Predicate<String> isContainsJava = str -> str.contains("Java");
        String test = "Java!";
        System.out.println("isContainsJava.test(test): " + isContainsJava.test(test));

        Predicate<String> combinePredicateAnd = isContainsJava.and(isLengthGreat6);
        System.out.println("combinePredicateAnd: " + combinePredicateAnd.test(test));

        Predicate<String> combinePredicateOr = isContainsJava.or(isLengthGreat6);
        System.out.println("combinePredicateOr: " + combinePredicateOr.test(test));

        Predicate<String> combinePredicateNot = isContainsJava.negate();
        System.out.println("combinePredicateNot: " + combinePredicateNot.test(test));

        System.out.println("\n ======================== \n");

        // Function<T, R> - производит операцию над объектом типа T и возвращает результат типа R.
        // R apply(T t)
        Function<String, Integer> integerFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                return 0;
            }
        };

        Function<String, Integer> function = str -> str.length();
        int length = function.apply("Hello, World!");
        System.out.println("function.apply(\"Hello, World!\"): " + length);


//        Function<String, String> toUpperCase = str -> str.toUpperCase();
        Function<String, String> toUpperCase = String::toUpperCase;
        System.out.println(toUpperCase.apply("test string"));
        Function<String, String> concatenate = s -> s + "!!!";

        Function<String, String> combineFunc = toUpperCase.andThen(concatenate);
        String result1 = combineFunc.apply("Hello");
        System.out.println(result1);



    }

    public static List<Integer> filterListByPredicate(List<Integer> integers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();

        for (Integer value : integers) {
            if (predicate.test(value)) {
                result.add(value);
            }
        }
        return result;
    }
}