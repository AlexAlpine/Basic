package lesson_05;


public class StringCompare {
    public static void main(String[] args) {

        int x = 10;

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JaVa";
        String str4 = new String("Java");

        System.out.println(str1);
        System.out.println(str4);

        // == когда мы сравниваем ссылочные типы (в том числе String) сравниваются ссылки.

        System.out.println("str1 == str2 -> " + (str1 == str2)); // ждем true
        System.out.println("str1 == str3 -> " + (str1 == str3)); // ждем false
        System.out.println("str2 == str4 -> " + (str2 == str4)); // ждем true - получили false
        System.out.println("str1 == str4 -> " + (str1 == str4)); // ждем true - получили false

        // Ссылочные типы данных нужно сравнивать метод equals (если мы хотим сравнить их значения, а не ссылки)
        //метод equals() сравнивает две строки ПО ЗНАЧЕНИЮ

        System.out.println("str1.equals(str2) -> " + str1.equals(str2));
        System.out.println("str1.equals(str4) -> " + str1.equals(str4));
        System.out.println("str1.equals(str3) -> " + str1.equals(str3));

    }
}