package homework_06;


import java.util.Scanner;

/*
Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.

Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число на выбор: 1, 2 или 3");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 1) {
            System.out.println("Вы ввели число один");
        } else if (number == 2) {
            System.out.println("Вы ввели число два");
        } else if (number == 3) {
            System.out.println("Вы ввели число три");
        } else {
            System.out.println("Вы ввели какое-то другое число");
        }


    }
}
