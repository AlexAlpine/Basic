package lessons.lesson_08;


import java.util.Random;

public class ForExample {
    public static void main(String[] args) {

        /*
        for (Начальная точка ; Блок проверок ; блок измения счетчика ) {
        // тело цикла
        }
         */

//        Пример перебора цифр от 0 до 5

        for (int i = 0; i <= 5; i++) {
            //тело цикла
            System.out.println(i);
        }


        int x = 0;
        while (x <= 5) {
            System.out.println(x);
            x++;
        }
        System.out.println(x);

        // Счетчик цикла не обязательно должен быть целочисленным. Более того, не обязательно должен быть числом.

        for (String str = "Hello"; str.length() < 10 ; str = str + "x") {
            System.out.println(str);
        }

        // Все три блока в синтаксисе цикла for НЕ обязательны.

//        for ( ; ; ) {
//            System.out.println("Hello");
//        }

        //

        //Мы можем инициализировать несколько переменных
        // В блоке изменений мы также можем изменять несколько переменных
        int k = 14;
        for (int a = 0, f = 1; k >= 0 && f < 10; k--, a = ++a + k, f++) {
            System.out.println(k + " : " + a + " : " + f);
        }

        // Создать массив случайной длины (от 4 до 10) целых чисел
        // Заполнить массив случайными числами от 0...1000

        Random random = new Random();

        int[] ints = new int[random.nextInt(7) + 4]; // создали массив
        System.out.println("Длина массива: " + ints.length);

        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(11);
            System.out.print(ints[i] + ((i < ints.length - 1) ? ", " : "]\n"));
        }



        // Найти элемент в массиве по его значению.
        // Мы возвращаем индекс
        // Если элемент найдет - будет индекс в пределах индексов массива
        // Если не найдем такое значение - значит вернет -1

        ints = new int[]{1, 5, 34, 56, 6, 20, 5, 11};

        int numberForSearch = 5;

        int index = -1;


        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == numberForSearch) {
                index = i;
                continue; // переход к следующей итерации цикла. Прекращает выполнение кода текущей итерации. И переход в блок изменений счетчика.
//                break; // прекращает работу цикла. Выходим из цикла.
            }
            System.out.println("Проверял " + ints[i]);
        }



        System.out.println("Число " + ((index >= 0 ) ? "найдено" : "не найдено") + " | индекс: " + index);

        if (index >= 0) {
            System.out.println("Число найдено. " + index + " | " + ints[index]);
        } else {
            System.out.println("Такое значение в массиве не найдено");
        }

    }
}
