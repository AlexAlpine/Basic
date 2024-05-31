package lessons.lesson_07;


import java.util.Random;

public class SwitchExample {
    public static void main(String[] args) {
        Random random = new Random();

        int choice = random.nextInt(4) + 1; // 1..4
        System.out.println("choice: " + choice);

        // 1 -> кофе
        // 2 - чай
        // 3 - сок
        // 4- вода

//        if (choice == 1) {
//            System.out.println("Кофе");
//        } else if (choice == 2)  {
//            System.out.println("Чай");
//        }

        switch (choice) {
            case 1: // choice == 1
                System.out.println("Приготовить кофе");
                // break;
            case 2:
                System.out.println("Чай");
                break;
            case 3:
                System.out.println("Сок");
                break;
            case 4:
                System.out.println("Вода");
                break;
            default:
                System.out.println("Не понятная кнопка!");
        }

        /*


        // Синтаксис, начиная с JDK 17
        switch (choice) {
            case 1 -> System.out.println("Кофе");
            case 2 -> System.out.println("Чай");
            case 3, 4 -> System.out.println("Вода или сок");
            default -> System.out.println("Default action");
        }

        choice = random.nextInt(101);

        System.out.println("choice: " + choice);

        int money = 0;
        money = switch (choice) {
            case 1 -> 20;
            case 3 -> money + 10;
            case 10 , 20, 30 -> money + 1000;
            default -> 15;
        };

        System.out.println("money: " + money);

        ========End Java 17

         */
        System.out.println("Продолжение программы");

    }
}
