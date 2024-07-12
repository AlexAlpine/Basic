package homework_37;

/*
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений,
отсортированный в порядке увеличения длин слов.

Если строки имеют одинаковую длину - сортировать в естественном порядке

public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
Copy
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]

 */

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String testString = "Тестовая строка для слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));
    }

    private static List<String> getUniqueSortedWords(String testString) {
        /*
        1. Избавиться от знаков препинания
        2. Разбить на слова
        3. Поместить слова в коллекцию, которая обеспечить уникальность и сортировку
        4. Преобразовать результат в список и вернуть
         */

        // Удаляем все символы, которые не являются буквой, цифрой или пробелом
        String stringOnlyWords = testString.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "");
        System.out.println("stringOnlyWords: " + stringOnlyWords);

        String[] words = stringOnlyWords.split(" ");

        // Уникальные, отсортированные значения
        Set<String> uniqueWords = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));

        uniqueWords.addAll(Arrays.asList(words));

        // Arrays.asList(words) - возвращает список, состоящий из элементов массива
        return new ArrayList<>(uniqueWords);

    }
}
