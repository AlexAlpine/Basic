package homework_10;

/*
Написать свой метод copyOfArray, дублирующий функционал метода Arrays.copyOf()

на вход принимает массив целых чисел и число - длину нового массива.

Метод должен создать и распечатать массив заданной в параметрах длинны.

В начало массива должны быть скопированы элементы из входящего массива:

{0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
 */

public class Task1 {
    public static void main(String[] args) {

        int[] digits = {0, 1, 2, 3, 4 , 5, 6};

        copyOfArray(digits, 11);

    } //Methods area

    public static void copyOfArray(int[] array, int newLength) {
        int[] result = new int[newLength];  //
        /*
        числовые -> 0/0.0
        boolean -> false
        ссылочных (в т.ч.String) -> null
         */
        for (int i = 0; i < result.length && i < array.length; i++) {
            result[i] = array[i];
        }
        printArray(result);

    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((i < arr.length -1 ) ? ", " : "]\n"));
        }
    }

}
