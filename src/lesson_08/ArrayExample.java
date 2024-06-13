package lesson_08;


import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {


        int[] array; // объявил массив  для int-ов
        String[] strings;
        // int array1[]; альтернативный способ объявления. НЕ рекомендуется использовать

        array = new int[4]; // создали массив типа int с 4 ячейками. // [0, 0, 0, 0]
        strings = new String[6]; // создали массив строк на 6 ячеек // [null, null, null, null, null, null]

        int[] array2 = new int[8]; // объявили и инициализировали массив int с 8 ячейками.

        // Значения по умолчанию
        /*
        - для всех числовых типов (в том числе и char) данных это будет 0 (0.0).
        - для boolean - false
        - для всех ссылочных типов значение - null (null - ничего)
         */

        // Явная инициализация массива
        int[] numbers = new int[]{45, 56, -16, 0, 159, 1444};
        int[] ints = {10, -54, 32224, 555}; // явная инициализация массива на 4 ячейки

        int value = numbers[0]; // взять значение из ячейки 0 массива numbers.

        System.out.println("В 0 ячейке массива numbers хранится число: " + value);
        System.out.println("В 3 ячейке массива numbers хранится число: " + numbers[3]);
        System.out.println("В 4 ячейке массива strings хранится число: " + strings[4]);

        System.out.println(numbers);

        System.out.println("Длинна массива (кол-во элементов в массиве): " + numbers.length);

        int j = 0;
        while (j < numbers.length) {
            System.out.print(numbers[j] + ", ");
            j++;
        }
        System.out.println();

        // [1, 2, 3, 4, 65]

        int i = 0;
        String arrayToString = "[";

        // перебираем индексы
        while (i < numbers.length) {

            arrayToString += numbers[i] + ((i == numbers.length - 1) ? "]" : ", ");

//            arrayToString += numbers[i]; // приклеиваем в строку число
//
//            // определяем, что "писать" после числа: запятую или закрывать скобку
//            if (i != numbers.length -1) {
//                arrayToString += ", ";
//            } else {
//                arrayToString += "]";
//            }
            i++;
        }

        System.out.println(arrayToString);


        System.out.println("\n =====================");
        System.out.println("Работаем с типом String,  как с массивом");

        String str = "Hello";
        int i1 = 0;
        while (i1 < str.length()) {
            System.out.print(str.charAt(i1++) + ", ");
        }
        System.out.println();

        char[] chars = str.toCharArray(); // получаю массив символов, из которых состояла строка
        System.out.println("длина массива chars: " + chars.length);

        int e = 0;
        System.out.print("[");
        while (e < chars.length) {
            System.out.print(chars[e] + ((e != chars.length - 1) ? ", " : "]"));
            e++;
        }
        System.out.println();

        int[] arr = {3, 5, 7, 9, 11, 15};
//        arr = {1,2,3,4,5}; // не допустимо. Ошибка компиляции. Перезаписать значения без использования new не получится
        arr = new int[]{1, 2, 3, 4}; //

        String[] words = {"String", "Java", "Hello", "Python"};
        System.out.println("words.length: " + words.length);
        System.out.println("words[1] -> " + words[1]);
        String python = words[3];
        System.out.println(python);


        // Присвоение новых значений элементам массива
        words[3] = "JS";

        i = 0;
        while (i < words.length) {
            System.out.print(words[i++] + " ");
        }
        System.out.println();

        //Создать массив из 10 целых чисел и заполнить его случайным значениями от 0..100;
        Random random = new Random();

        int[] nums = new int[10];

        i = 0;
        System.out.print("[");
        while (i < nums.length) {
            nums[i] = random.nextInt(101);
            System.out.print(nums[i] + ((i != nums.length -1) ? ", " : "]"));
            i++;
        }
        System.out.println();

        // Найти минимальное значение в массиве

        int c = 0;
        int min = nums[0];

        while (c < nums.length) {
            if (nums[c] < min) {
                min = nums[c];
            }
            c++;
        }

        System.out.println("min значение в массиве: " + min);

    }
}
