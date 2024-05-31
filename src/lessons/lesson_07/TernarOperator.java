package lessons.lesson_07;


public class TernarOperator {
    public static void main(String[] args) {

        // пользователь вводит какое-то число
        // Если число больше или равно 0 - прибавить к нему 20, иначе отнять от него 10

        int n = 10;

        if (n >= 0) {
            n += 20;
        } else {
            n -= 10;
        }

        n = (n >= 0) ? n + 20 : n - 10;

        // true -> n = n +20;
        //false -> n = n -10;

        int x = 0;

        String result;

        if (x > 0) {
            result = "больше нуля";
        } else {
            result = "меньше или нуля";
        }
        System.out.println(result);

        System.out.println((x > 0) ? "больше нуля" : "меньше или нуля");

    }
}
