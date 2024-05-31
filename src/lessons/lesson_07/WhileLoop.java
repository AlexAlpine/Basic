package lessons.lesson_07;


import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int waterInBarrel = 0;

        while (waterInBarrel < 300) {
            // Тело цикла
            // Несем ведро с водой и выливаем в бочку
            waterInBarrel += 25; // вылили ведро в бочку
            System.out.println("Добавил ведро. В бочке теперь: " + waterInBarrel + " литров воды");
        }

        System.out.println("Бочка наполнена");

        // Получить и распечатать последовательность чисел от 0 до 10 включительно

        int x = 0;

        while (x <= 10) {
            // тело цикла
            System.out.println(x);
            x++; // x = x +1
        }

        System.out.println("Текущее значение x: " + x);

        // Распечатать все числа от 100 до 90 в порядке убывания.

//        100 .. 90 // шаг в 1

        int y = 100;

        while (y > 89) {
            System.out.println(y--);
        }

        System.out.println("y: " + y);

        // Вывести на экран все четный числа в диапазоне от 0 до 21
        /*
        1. Запустить перебор чисел от 0 до 21
        2. Проверить является ли число четным
            2.1. Если четное - распечатать
            2.2. Если нет - никаких действий не требуется. Берем след.число
        3. Увеличить счетчик цикла (перебираемое число)
         */

        int i = 0;
        while (i <= 21) {
            // проверка числа на четность
            if (i != 0 && i % 2 == 0) { // является четным. Надо распечатать
                System.out.print(i + "; ");
            }


            i++;
        }
        System.out.println();

        String hello = "Hello, Java!"; // 0...l-1

        // распечатать каждый символ из строки hello в отдельной строке.

        // По сути. Нам нужно перебрать все доступные индексы в нашей строке.
        // по индексу взять текущий символ и вывести на экран символ и его 10-код.


        i = 0; // 0, 1, 2, 3, 4... len-1
        while (i <= hello.length() -1 ) {
            char ch = hello.charAt(i);
            System.out.println(ch + " | " + (int) ch);
            i++;
        }

        // Цикл с пост-условием. do-while.
        // Сначала выполняется тело цикла (как минимум 1 раз),
        // потом проверяется условие. Если true - еще раз выполняется тело цикла и потом проверка.

        int a = 0;

        do {
            // Тело цикла
            System.out.println("Внутри тела цикла do-while: " + a);
            a++;
        } while ((a < 0));

        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.println("Сделайте выбор: введите число 1 или 2");
        number = scanner.nextInt();
        scanner.nextLine();

        while (number != 2 && number != 1) {
            System.out.println("Введите число 1 или 2");
            number = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("После while. Спасибо, вы ввели 1 или 2");


        int counter = 0;
        do {
            System.out.println("Do - Сделайте выбор: введите 1 или 2");
            number = scanner.nextInt();
            scanner.nextLine();
            counter++;
        } while (number != 2 && number != 1);

//        } while (number != 2 && number != 1 &&  counter < 3);

//        if (counter == 3  && number != 2 && number != 1) {
//            System.out.println("Завершение программы");
//            System.exit(0);
//        }

        System.out.println("Вы ввели число с " + counter + " попытки!");

    }
}
