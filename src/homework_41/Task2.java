package homework_41;

/*
Имеется список строк.
Используя Stream API, найдите строку с максимальной длиной.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of("String", "Hello", "World", "Java", "LongString");
//        strings = new ArrayList<>();

        Optional<String> optionalString = strings.stream()
                .max((s1, s2) -> s1.length() - s2.length());
//                .min((s1, s2) -> s2.length() - s1.length());

        System.out.println(optionalString.orElse("Что-то пошло не так"));

        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Числа нет"));

    }
}