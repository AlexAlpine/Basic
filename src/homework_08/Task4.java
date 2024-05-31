package homework_08;


/*
Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] arr = { 5, 6, -25, 0, 31, -15 };

        int min = arr[0];
        int minIndex = 0;

        int max = arr[0];
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }

            if (arr[i] > max) {
                max  =arr[i];
                maxIndex = i;
            }
        }

        System.out.println("max: " + max + " index: " + maxIndex);
        System.out.println("mix: " + min + " index: " + minIndex);

//        arr[minIndex] = max;
//        arr[maxIndex] = min;

        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;



        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

    }
}
