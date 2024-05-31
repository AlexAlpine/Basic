package homework_05;

/*
Task 4
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int digit = 6;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        digit = scanner.nextInt();
        scanner.nextLine();

        // четность числа
        boolean isEven = digit % 2 == 0;
        boolean isDevByThree = digit % 3 == 0;
        boolean isTwice = isEven & isDevByThree;

        System.out.printf("Число: %d четное: %s; кратно 3: %s; четное и кратное 3: %s\n", digit, isEven, isDevByThree, isTwice);


    }
}
