package lesson_06;

import java.util.Random;

public class Task {
    public static void main(String[] args) {


        int note;
        int money = 100;

        Random random = new Random();

        note = random.nextInt(5) + 1;
        System.out.println("ребенок принес: " + note);

        if (note == 5) {
            money += 20;
        } else if (note == 4) {
            money += 10;
        } else if (note == 3) {
            
        } else if (note == 2) {
            money -=10;
        } else if (note == 1) {
            money = 0;
        }else {
            System.out.println("таких оценок не бывает");
        }
        System.out.println("у ребенка теперь " + money + "денег");

    }

        }
    

