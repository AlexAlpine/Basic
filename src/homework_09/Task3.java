package homework_09;


import java.util.Random;

/*
Заполните массив 50 случайными числами от 1 до 100.

Программа должна найти, и вывести на экран все простые числа.

Посчитайте сколько получилось таких чисел в массиве.

Простое число - число, которое делится на цело только на 1 и само себя.

Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
 */
public class Task3 {
    public static void main(String[] args) {

        int range = 1000;
        int[] numbers = new int[range];

        fillArray(numbers);
        printNumbers(numbers);

        int counter = 0;

        long v1 = 0;
        long v2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            boolean isSimple = true;

            // проверяем число на простоту.
            // Если простое - counter++ и вывести число в консоль
            // Если нет - переходим к след. числу.

            // Deepl

            if (num < 2) continue; // не является простым. Проверяем следующее


            for (int j = 2; j < num; j++) {
                v2++;
                if (num % j == 0 ){
                    isSimple = false;
                    break; // прерываем проверку делителей. Число уже НЕ является простым
                }
            }

            if (num == 2 || num == 3) {
                // число простое. Переходим к след. (но надо посчитать его и распечатать)
                System.out.print(num + ", ");
                counter++; // увеличить счетчик простых чисел
                continue; //
            }

            if (num % 2 == 0 || num % 3 == 0) {
                isSimple = false;
                continue; // переходим к проверке следующего в массиве
            }

//            for (int j = 5; j * j <= num ; j = j + 6) {
            for (int j = 5; j <= Math.sqrt(num) ; j = j + 6) {
                v1++;
                if (num % j == 0 || num % (j + 2) == 0) {
                    isSimple = false;
                    break;
                }
            }




            if (isSimple) {
                //прошло проверку на простоту
                System.out.print(num + ", ");
                counter++; // увеличить счетчик простых чисел
            }
        }

        System.out.println();
        System.out.println("Найдено простых чисел: " + counter);

        System.out.println("v1: " + v1 );
        System.out.println("v2: " + v2 );




    } // Methods area

    public static void fillArray(int[] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000) + 1;
        }
    }


    public static void printNumbers(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((i < arr.length -1) ? ", " : "]\n"));
        }
    }


}
