package homework_37;


/*
Написать метод, возвращающий первый неповторяющийся символ в строке

public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println(StrUtil.getFirstUniqueChar(string));
    }

    //Output:
    e
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        String string = "aabcdefj ab,cdf,";
        System.out.println(getFirstUniqueChar(string));
    }

    private static Character getFirstUniqueChar(String string) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        Set<Character> repeatedChars = new HashSet<>();

        // 1. перебрать в цикле все символы в строке
        // 2. Проверить является ли символ уникальным
        // 3. Потом будем смотреть что получило?


        // преобразую строку в массив символов и перебираю символы в цикле
        for (char ch : string.toCharArray()) {

            // Присутствует ли текущий символ в сете повторяющихся?
            if (repeatedChars.contains(ch)) {
                // если буквы есть в повтораx - переходим к следующей букве
                continue;
            }

            // проверяю, присутствует ли текущий символ в сете уникальных?
            if (uniqueChars.contains(ch)) {
                // Убираю из сета уникальных
                uniqueChars.remove(ch);
                // Запоминаю эту букву - она уже была
                repeatedChars.add(ch);
            } else {
                uniqueChars.add(ch);
            }
        }

        System.out.println("uniqueChars: " + uniqueChars);

//        List<Character> characters = new ArrayList<>(uniqueChars);// и потом взять 0-й индекс
//        System.out.println(characters.get(0));

        // Получить первый элемент коллекции при помощи итератора
//        Iterator<Character> iterator = uniqueChars.iterator();
//        iterator.next();

        // Заменяем на тернарный оператор
//        if (uniqueChars.isEmpty()) {
//            return null;
//        }else {
//           return uniqueChars.iterator().next();
//        }


        return uniqueChars.isEmpty() ? null : uniqueChars.iterator().next();

        // return new ArrayList<>(uniqueChars).get(0); // достучаться до элемента по индексу можно только через список. У сетов нет индексов

    }
}
