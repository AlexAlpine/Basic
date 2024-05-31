package lessons.lesson_05;


import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Строка
        System.out.println("Введите Ваше имя: ");
        String name = scanner.nextLine();

        System.out.println("Привет, " + name + "!");


        // Число с запятой
        System.out.println("Сколько стоит кефир?");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Кефир стоит: " + price); // 1.57. 1,57; 1.57


        // Целое число
        System.out.println("Введи Ваш возраст: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ваш возраст: " + age);






    }
}
