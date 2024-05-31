package homework_07;

import java.util.Scanner;

/*
Напишите программу с использованием оператора switch:

Программа просит пользователя ввести число от 1 до 7.

Если число равно 1, выводим на консоль "Понедельник", 2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".

 */
public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер дня недели");

        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вт");
                break;
            case 3:
                System.out.println("Ср");
                break;
            case 4:
                System.out.println("Чт");
                break;
            case 5:
                System.out.println("Пт");
                break;
            case 6:
            case 7:
                System.out.println("Выходные");
                break;
            default:
                System.out.println("Таких дней еще не придумали");
        }

    }
}
