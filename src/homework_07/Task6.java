package homework_07;


import java.util.Scanner;

/*
Напишите программу, которая просит пользователя ввести слово "hello".

Если пользователь вводит правильное слово, программа благодарит его и завершает работу.
Если вводится неправильное слово, программа продолжает запрашивать ввод, пока не будет введено правильное слово.

Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова, и выведите это количество на экран.


 */
public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        String input;

        do {
            System.out.println("Введите слово hello");
            input = scanner.nextLine();
            counter++;
        } while (!input.equalsIgnoreCase("hello"));


        System.out.println("Спасибо, ввод принят. Использовано попыток: " + counter);

    }
}
