package lessons.lesson_04;


public class TypeCharExample {
    public static void main(String[] args) {
        char a = 'A'; // Переменна будет хранить букву A латинского алфавита
        char a1 = 65; // Переменная будет хранить букву A латинского алфавита, соответствующая коду 65 в десятичной системе счисления
        char a2 = 0x41; // присваиваем число в 16-формате. Что соответствует все той же букве A
        a2 = 0x0041; // полная форма записи числа в 16 системе
        char a3 = '\u0041';
        char x = '\u1547';


        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);
        System.out.println("x: " + x);

        char digit0 = 48;
        System.out.println("digit0: " + digit0);

        digit0 += 5;
        System.out.println("digit0: " + digit0);

        char letter = 97; // a
        letter++;
        System.out.println("letter: " + letter);

        System.out.println(0 + letter); // int + char = int
        System.out.println("int из чара даст код символа в 10 системе: " + (int) letter); //

        // 0...9 -> соответствуют коды 48...57
        // a...z -> 97...122
        // A...Z -> 65...90

        char x1 = 12853;
        System.out.println(x1);


        int digit = 48;
        System.out.println(digit++); // пост-инкремент
        System.out.println(digit);

        System.out.println("\n==================\n");

        int number = 48;
        System.out.println(++number); // пред-инкремент
        System.out.println(number); // пред-инкремент



        number = 100;
        System.out.println(--number); // 99

        System.out.println(number-- + " | " + number); // 99 | 98


    }
}
