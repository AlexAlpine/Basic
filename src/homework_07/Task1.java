package homework_07;

/*
Перепишите решение задачи с использованием switch вместо if-else:

Напишите программу, которая предлагает пользователю ввести число 1, 2 или 3.
Программа должна выводить на экран введенное число прописью: "Один", "Два" или "Три".

 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1, 2 или 3");

        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                System.out.println("Вы ввели один");
                break;
            case 2:
                System.out.println("Вы ввели два");
                break;
            case 3:
                System.out.println("Вы ввели три");
                break;
            default:
                System.out.println("Ваш ввод не корректен");
        }
    }
}
