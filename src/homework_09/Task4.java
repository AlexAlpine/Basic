package homework_09;

/*
Task4
Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:
1
12
123
1234
12345
123456

 */
//1 -1..i
//2 -> 1..i
//6 -> 1..i

public class Task4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) { // перебирает числа
            for (int j = 1; j <= i; j++) { // перебирает числа от 1 до i (i - перебирается во внешнем цикле)
                System.out.print(j);
            }
            System.out.println();
        }


        int[][] arr = new int[3][4];

        arr[0][0] = 100;
        System.out.println("\n=================\n");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i+j;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
