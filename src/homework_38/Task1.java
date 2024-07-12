package homework_38;



/*
Частотный словарь слов: Напишите метод,
который принимает строку текста и возвращает Map<String, Integer>,
где каждому слову соответствует количество его вхождений в текст.


Task2
Опционально:
Напишите метод, возвращающий частотный словарь вхождения символов в строку

public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
    }
 */


import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {

        String text = "Строка для, проверки количества   вхождений слов" +
                ".\n Строка для проверки  и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
//        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("Option1: " + frequencyDictionary(text));
        System.out.println("Option2: " + frequencyDictionary2(text));
        System.out.println("Option3: " + frequencyDictionary3(text));
        System.out.println("Option4: " + frequencyDictionary4(text));

        System.out.println();

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);
        System.out.println("Chars: " + frequencyCharsMap);
        System.out.println("Chars2: " + frequencyCharsDictionary2(text));

//        System.out.println("\nВхождение символов: ");
//        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v + "; "));
//        System.out.println();
    }

    private static Map<Character, Integer> frequencyCharsDictionary(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<Character, Integer> result = new HashMap<>();

        //перебираю слова
        for (String word : words) {
            //перебираю буквы в слове
            for (Character ch : word.toCharArray()) {
                result.compute(ch, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
            }
        }
        return result;
    }

    private static Map<Character, Integer> frequencyCharsDictionary2(String text) {

        Map<Character, Integer> result = new HashMap<>();

            //перебираю символы в строке
            for (Character ch : text.toCharArray()) {
                result.compute(ch, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
            }

        return result;
    }

    private static Map<String, Integer> frequencyDictionary(String text) {
        /*
        1. Поместить в какую-то коллекцию слова из текста
        2. Создать карту вхождения слов -> Слово : кол-во вхождений
        3. Перебирать слова. Проверять:
        Если есть слово - обновить значение (староеЗначение + 1.)
        Если слова нет - добавить новый ключ со значением 1
        */

        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");
//        System.out.println(Arrays.toString(words));

        Map<String, Integer> result = new HashMap<>();

        //перебираю слова
        for (String word : words) {

            // Пытаюсь получить значение, ассоциированное ключу "текущее слово"
            Integer amount = result.get(word);

            // Если такого ключа в карте нет - вернется null

            // если значения не было, присваиваю 0
            if (amount == null) {
                amount = 0;
            }

            // увеличиваю значение на +1
            amount = amount + 1;

            // перезаписать в карту новое соответствие текущему ключу
            result.put(word, amount);
        }


        return result;
    }

    private static Map<String, Integer> frequencyDictionary2(String text) {

        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");
//        System.out.println(Arrays.toString(words));

        Map<String, Integer> result = new HashMap<>();

        //перебираю слова
        for (String word : words) {
            // Пытаюсь получить значение, ассоциированное ключу "текущее слово"
            // Если такого ключа в карте нет - вернется null
            // если значения не было, присваиваю 0

            Integer amount = result.getOrDefault(word, 0);

            // перезаписать в карту новое соответствие текущему ключу
            result.put(word, ++amount);
        }
        return result;
    }

    private static Map<String, Integer> frequencyDictionary3(String text) {

        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");
//        System.out.println(Arrays.toString(words));

        Map<String, Integer> result = new HashMap<>();

        //перебираю слова
        for (String word : words) {
           /*
           compute(K key, BiFunction<K,V> remappingFunction)
           Метод compute позволяет вычислить новое значение для указанного ключа, используя функцию пересчета
           Новое значение может зависеть от текущего ключа и его значения
           Если функция вернет null, то запись удаляется из карты
            */

//            result.compute(word, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);


            // Вычисляет новое значение, ТОЛЬКО ЕСЛИ ключу было ассоциировано какое-то неNull значение
            result.computeIfPresent(word, (key, value) -> value + 1);

            // Метод вычисляет новое значение для ключа, ТОЛЬКО ЕСЛИ ключ еще не присутствует в карте (или ассоц. с null)
            result.computeIfAbsent(word, key -> 1);
        }
        return result;
    }

    private static Map<String, Integer> frequencyDictionary4(String text) {

        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");
//        System.out.println(Arrays.toString(words));

        Map<String, Integer> result = new HashMap<>();

        //перебираю слова
        for (String word : words) {
           /*
           merge(K key, V value, BiFunction<K,V> remappingFunction)
           Метод merge используется для объединения значений по ключу
           Как работает:
           - Если ключ не существует (или ассоц. с null), новое значение будет вставляться в карту
           - Если ключ уже существует (и ассоц. неNull значением) применится функция объединения,
           которая может использовать старое и новое значение для вычислений
           - Если функция вернет null - пара удаляется (или не записывается)
            */

            result.merge(word, 1, (oldValue, myValue) -> oldValue + myValue);

        }
        return result;
    }


}