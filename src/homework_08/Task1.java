package homework_08;


/*
Распечатать все числа от 1 до 100, которые делятся на 5 без остатка, используя цикл do-while.
 */

public class Task1 {
    public static void main(String[] args) {

        int i = 1;

        do {
            if ( i % 5 == 0) {
                System.out.print(i + ", ");
            }
            i++;
        } while (i <= 100);

        System.out.println();

    }
}
