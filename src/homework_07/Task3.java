package homework_07;


import java.util.Random;

/*
Используйте оператор switch для решения задачи:

Ваш ребенок принес оценку за контрольную работу по математике.

В школе 12-балльная система. Запишите в переменную случайное число от 0 до 12.

Вы разрешаете ребенку смотреть телевизор не более 60 минут в день. На сегодня у него осталось 45 минут.

Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
Оценка от 7 до 9 баллов: похвалите ребенка и добавьте 45 минут.
Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
Оценка 3 балла: огорчитесь и вычтите 30 минут.
Оценка меньше 3 баллов: запретите телевизор на сегодня.

Выведите на экран оставшееся время для просмотра ТВ.
 */
public class Task3 {

    public static void main(String[] args) {
        Random random = new Random();

        int note = random.nextInt(12) + 1; //[1..12]
        int restTime = 45;

        System.out.println("Оценка: " + note);

        switch (note) {
            case 12:
            case 11:
            case 10:
                System.out.println("как вы рады");
                restTime += 60;
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("похвалите ребенка");
                restTime += 45;
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("нейтрально отнеситесь");
                restTime += 15;
                break;
            case 3:
                System.out.println("Огорчитесь");
                restTime -= 30;
                break;
            case 2:
            case 1:
                System.out.println("Кошмар");
                restTime = 0;
                break;
            default:
                System.out.println("Таких оценок не бывает!");

        }

        if (restTime > 60) restTime = 60;
        if (restTime < 0) restTime = 0;


        System.out.println("оставшееся время для просмотра ТВ: " + restTime);

    }
}
