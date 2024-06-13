package lesson_06;


import java.util.Random;
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        int x = 10;


        {
            int y = 5;
            x = x + y;
//            System.out.println(x);
//            System.out.println(y);
        }

        //x = x + y; // ошибка компиляции. Переменная y не видна (не доступна) вне своего "блока"

        int y = 124;

        y = 8;

//        if (y > 25) System.out.println("Всем привет!");

        if (y > 11) {
            System.out.println("Всем привет");
            System.out.println("Сейчас y равен: " + y);
        } else if (y > 7) {
            System.out.println("Мы находимся в блоке ELSE-IF");
            System.out.println("Сейчас y равен: " + y);
        } else {
            System.out.println("Мы находимся в блоке else");
            System.out.println("Сейчас y равен: " + y);
        }


        System.out.println("Продолжение программы");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1 или 10: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 1) {
            System.out.println("Вы ввели число один");
        } else if (number == 10) {
            System.out.println("Вы ввели десять");
        } else {
            System.out.println("Вы ввели не верное число!!! ");
        }

        System.out.println("\n======================\n");
        /*
        У ребенка есть карманные деньги. Для простоты используем тип int. И сейчас у него 100 денег
        Ребенок пришел из школы и принес оценку. (от 1 до 5 включительно)
        За хорошие оценки ребенок получает деньги, за плохие отбирают

        5 -> + 20
        4 -> + 10

        3 -> +0
        2 -> -10
        1 - > все

        Введите оценку ребенка.
        Теперь у ребенка 120 денег;

         */

        int money = 100;
        int note;

        // Генерация случайного числа.
        Random random = new Random();

        note = random.nextInt(5) + 1 ; // [0,5) -> [0,4] -> 0,1,2,3,4 -> [1,5] -> 1,2,3,4,5
        System.out.println("Ребенко принес: "  + note);

        if (note == 5) {
            money += 20; // money = money + 20
        } else if (note == 4) {
            money += 10;
        } else if (note == 3) {

        } else if (note == 2) {
            money -=10;
        } else if (note == 1) {
            money = 0;
        } else {
            System.out.println("Таких оценок не бывает");
        }


        System.out.println("У ребенка теперь " + money + " денег");


    }
}
