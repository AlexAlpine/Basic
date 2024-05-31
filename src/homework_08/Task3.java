package homework_08;

/*
Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.

Вывести на экран:

Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
 */



import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] ints = new int[random.nextInt(11) + 5]; //массив целых чисел произвольной длины от 5 до 15

        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50; // 0..100 - 50 -> -50...50
            System.out.print(ints[i] + ((i < ints.length -1) ? ", " : "]\n"));
        }

        int sum = 0;

        int min = ints[0];
        int max = ints[0];

        int i = 0;

        while (i < ints.length) {
            sum += ints[i];

            if (ints[i] > max) max = ints[i];

            if (ints[i] < min) min = ints[i];

            i++;
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("Average: " + sum / ints.length);

    }
}
