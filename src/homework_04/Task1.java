package homework_04;

/*
Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхний регистр.

Для каждой буквы имени создайте отдельную переменную типа char, инициализированную соответствующей буквой в нижнем регистре.

Затем преобразуйте каждую букву в верхний регистр, используя только арифметические операции (без использования библиотечных функций), и выведите результат.
 */
public class Task1 {
    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'a';
        char ch3 = 'n';
        char ch4 = 'n';
        char ch5 = 'a';

        // Ваш код
        System.out.println((int) ch1);
        ch1 = (char) (ch1 - 32);
        ch2 -= 32; // ch2 = ch2 - 32;
        ch3 -= 32;
        ch4 -= 32;
        ch5 -= 32;


        System.out.println(ch1 + ch2 + ch3 + ch4 + ch5);

        System.out.println("\n ============================= \n");

        System.out.println(1 + 2);
        // String + int + double
        System.out.println(1 + 2 + " hello " + 1 + 2); // ? + String
        System.out.println(3 + " hello " + "1" + "2"); // ? + String

        System.out.println(1 + 2 + " hello " + (1 + 2));

    }
}
