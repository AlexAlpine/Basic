package homework_05;

/*
Task 3
Попросите пользователя ввести строку чётной длины с клавиатуры.
Распечатайте два средних символа строки.
Например:

Для строки "string" результат будет "ri".
Для строки "code" результат будет "od".
Для строки "Practice" результат будет "ct".
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        String string = "Practice";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово:");
        string = scanner.nextLine();

        int index1 = string.length() / 2 - 1;

        // Opt 1
        System.out.println("" + string.charAt(index1) + string.charAt(index1 + 1));

        //Opt 2
        String substring = string.substring(index1, index1 + 2);
        System.out.println(substring);

    }
}
