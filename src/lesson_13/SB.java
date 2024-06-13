package lesson_13;


import java.util.Arrays;
import java.util.Scanner;

public class SB {
    public static void main(String[] args) {

        // StringBuilder
        String string = "Hello" + " from " + "Java";
        System.out.println(string);

        StringBuilder stringBuilder = new StringBuilder();

        //Метод для добавления содержимого (прилепить справа)
        stringBuilder.append("Hello");
        stringBuilder.append(" ").append("Java");

        // Получить строковое представление
        String string1 = stringBuilder.toString();
        System.out.println(string1);

        // Вставить в указанную позицию
        StringBuilder sb = new StringBuilder("Hello World");
        sb.insert(6, "Beautiful ");
        System.out.println(sb);

        // Замена подстроки (определяется индексами) на указанное значение
        StringBuilder sb1 = new StringBuilder("Hello World!");
        sb1.replace(6, 11, "Java");
        System.out.println(sb1);

        // Удалить подстроку в диапазоне от start до end
        StringBuilder sb2 = new StringBuilder("Hello World!");
        sb2.delete(5, 11);
        System.out.println(sb2);

        // Методы получения инфо
        System.out.println("sb2.length(): " + sb2.length());

        // Получить символ по индексу
        char ch = sb1.charAt(3);
        System.out.println(ch);

        // Получить подстроку
        String substring = sb1.substring(3);
        System.out.println("sb1.substring(3): " + substring);

        substring = sb1.substring(3, 8);
        System.out.println("sb1.substring(3, 8): " + substring);

        // Изменение размера
        // '\u0000'
        StringBuilder sb5 = new StringBuilder("Hello");
        sb5.setLength(10);
        System.out.println(sb5);
        System.out.println((int) sb5.charAt(8));

        sb5.setLength(3);
        System.out.println(sb5);

        /*
        Напишите программу, которая запрашивает у пользователя строку,
        состоящую из нескольких слов, разделенных пробелами.

        Программа должна создать и вывести аббревиатуру этой фразы (состоящая из первых букв каждого слова,
        записанных в верхнем регистре)

        Вход: united nations -> UN
        Java virtual machine -> JVM


         */

        String test = "Hello Java Test";
        String[] strings = test.split(" ");
        System.out.println(Arrays.toString(strings));


        String abbreviation = phraseString();

        System.out.println("abbreviation: " + abbreviation);




    }

    public static String phraseString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку, состоящую");

        String phrase = scanner.nextLine();

        String[] words = phrase.split(" ");
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty() && word != null ) {
                sb.append(word.charAt(0));
            }
        }

        return sb.toString().toUpperCase();

    }

}