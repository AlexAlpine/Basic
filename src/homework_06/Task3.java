package homework_06;


/*
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.

Проверить, является ли число "счастливым билетом".
Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
Примеры:

Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        /*
        1. Получить от пользователя строку (содержащую число) ++
        2. Проверить, что полученное число 4-х значное.
        3. Проверить "счастливость" билета
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 4-х значное число!");

        String number = scanner.nextLine();

        // 1221
        if (number.length() == 4) {
            // код проверки на счастливость

            char ch0 = number.charAt(0);
            if (ch0 < 48 || ch0 > 57) {
                System.out.println("Это не цифра");
                System.exit(0); // Завершает работы программы
            }

            // проверяем усердно остальные три символа.
            int leftSumCodes = number.charAt(0) + number.charAt(1);
            int rightSumCodes = number.charAt(2) + number.charAt(3);

            System.out.println("leftSumCodes: " + leftSumCodes);
            System.out.println("rightSumCodes: " + rightSumCodes);

            if (leftSumCodes == rightSumCodes) {
                System.out.println("Ура! число счастливое! ");
            } else {
                System.out.println("Сумма цифр не совпадает");
            }


        } else {
            System.out.println("Вы ввели не 4-х значное число!");
        }

        if (number.length() == 4) {
            int digit = Integer.parseInt(number); // Эта магия пытается вытащить целое число из строки и поместить его в переменную типа int

            System.out.println("Получили число: " + digit );

            // 1234
            // откусывать по 1 циферке
            int digit0 = digit % 10; // получаю последнюю цифру числа
            digit = digit / 10;

            // 123
            int digit1 = digit % 10;
            digit /= 10;

            //12
            int digit2 = digit % 10;
            int digit3 = digit / 10;

            System.out.println(digit3 + " | " + digit2 + " | " + digit1 + " | " + digit0);

            if ( digit0 + digit1 == digit2 + digit3) {
                System.out.println("V2. Happy!");
            } else {
                System.out.println("V2. Не счастливое");
            }



            // Код обработки строки
        } else {
            System.out.println("V2. НЕ 4 символа!");
        }


    }
}
