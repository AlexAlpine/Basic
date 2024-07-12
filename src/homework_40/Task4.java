package homework_40;

/*
Дан список строк. Используя Stream API, отфильтруйте строки,
которые начинаются на определенную букву (например, "A"),
удалите дубликаты и
отсортируйте их в алфавитном порядке.
 */

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<String> strings = List.of("test", "Abba", "Arrow", "Java", "JavaScript",  "A");

        List<String> filteredList = strings.stream()
                .filter(str -> str.startsWith("A")) // проверяет начинается ли строка подстрокой
//                .filter(str -> str.endsWith("row")) // Проверяет заканчивается ли строка подстрокой
//                .filter(str -> str.contains("ava")) // Проверяет содержит ли строка подстрокой
//                .filter(str -> str.charAt(0) == 'A')
//                .filter(str -> str.substring(0, 1).equals("A"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filteredList);


    }
}