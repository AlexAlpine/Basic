package homework_06;

/*
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
 */

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int int1 = random.nextInt(101); // [0..100]
        int int2 = random.nextInt(101); // [0..100]
        int int3 = random.nextInt(101); // [0..100]
        int int4 = random.nextInt(101); // [0..100]

        System.out.printf("Работаем с числами %d, %d, %d, %d\n", int1, int2, int3, int4);

        int max = int1;

        if (int2 > max) max = int2;

        if (int3 > max) max = int3;

        if (int4 > max) max = int4;

        System.out.println("Максимальное значение: " + max);

    }
}
