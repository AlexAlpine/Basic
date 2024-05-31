package homework_08;


import java.util.Scanner;

/*
Программа запрашивает у пользователя ввод произвольного числа. Вывести сумму цифр этого числа.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите какое-то число: ");
        int userNumber = scanner.nextInt();
        scanner.nextLine();

        if (userNumber < 0) userNumber *= -1;
        int userInputCopy = userNumber;

        int sum = 0;

        while (userNumber > 0) {
            // код откусывания цифры
            int currentDigit = userNumber % 10;

            sum += currentDigit;

            // 567432 -> 5+6+7+4+3+2 -> 27

            System.out.print(currentDigit + ((userNumber > 10) ? " + " : " -> "));

            userNumber /= 10;

        }

        System.out.println(sum);

        System.out.println("\n ====================== \n");
        // 567432 -> 5+6+7+4+3+2 -> 27

//        String numStr = "" + userInputCopy;
        String numStr = String.valueOf(userInputCopy);
        int len = numStr.length();

        int sum2 = 0;

        while (len > 0) {
            int pow = (int) Math.pow(10, len - 1); // 10 в степени (l-1)

            int digit = userInputCopy / pow; // получаю самую левую цифру
            sum2 += digit;

            System.out.print(digit + ((len > 1) ? " + " : " = "));
            userInputCopy = userInputCopy % pow;

            len--;
        }

        System.out.println(sum2);


    }
}
