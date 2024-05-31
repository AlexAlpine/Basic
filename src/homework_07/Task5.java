package homework_07;

/*
Используйте цикл while для решения задачи:

Распечатайте 7 чисел от 1 до 100, которые делятся на 5 без остатка.
 */
public class Task5 {
    public static void main(String[] args) {

        int i = 1;
        int countNumber = 0;

        while (i <= 100 && countNumber < 7 ) {
            if (i % 5 == 0) {
                // число подходит. Надо что-то делать
                System.out.println(i);
                countNumber++;
            }

            i++;
        }
    }
}
