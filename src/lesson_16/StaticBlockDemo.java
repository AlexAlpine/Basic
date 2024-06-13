package lesson_16;


public class StaticBlockDemo {

    private static int counter = 5;
    private static String[] strings = new String[counter];

    private String title = "Str1";
    private int capacity = 5;
    private int[] ints = new int[capacity];

    // Статический блок инициализации
    static {
        System.out.println("Static init block start!");
        strings = new String[3];
        strings[0] = "Blue";
        strings[1] = "Yellow";
        strings[2] = "Red";
    }

    // Не статический блок инициализации
    {
        System.out.println("NON-static block");

    }

    static {
        System.out.println("Second STATIC init block");
        counter = 100;
    }

    public StaticBlockDemo(String title, int capacity) {
        System.out.println("Class Constructor start");
        this.title = title;
        this.capacity = 10;

    }

    public static void main(String[] args) {
//        System.out.println("counter: " + StaticBlockDemo.counter);
//        String[] strings1 = StaticBlockDemo.strings;
//        System.out.println(strings1.length);

        StaticBlockDemo staticBlockDemo = new StaticBlockDemo("Hello", 14);

        System.out.println("\n ===============");

        StaticBlockDemo staticBlockDemo1 = new StaticBlockDemo("Str1", 100);

    }
}
