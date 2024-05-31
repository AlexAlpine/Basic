package homework_06;

public class Task4 {
    public static void main(String[] args) {

        System.out.println((true | false) | (45 < 70) & !(true) ^ (6 == 5));
        System.out.println((true | false) | (45 < 70) & (false) ^ (6 == 5));
        System.out.println((true | false) | (false) ^ (6 == 5));
        System.out.println((true | false) | (false));
        System.out.println((true) | (false));
        System.out.println(true);

    }
}
