package homework_08;


/*
Дан массив строк. Вывести на экран все символы самой длинной строки из массива.

Пример:

{ "One", "Two", "Twenty" } ->

T
w
e
n
t
y
 */
public class Task5 {
    public static void main(String[] args) {
        String[] strings = { "One",  null, "Two", "Twenty" };
//        String[] strings = null;

        String longestString = strings[0];

        for (int i = 1; i < strings.length; i++) {
            if (strings[i] != null && strings[i].length() > longestString.length()) {
                longestString = strings[i];
            }
        }

        System.out.println(longestString);

        char[] chars = longestString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + ", ");
        }
        System.out.println();

    }

}
