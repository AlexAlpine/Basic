package lesson_16;


public class Test {
    int x = statX + 5;

    static int statX;



    public static void staticInfo() {
        System.out.println("info");
        // x - нет доступа
        // nonStatic2() - нет доступа (не видит)
        statX += 100;
        statX = staticIntAdd(50);
    }

    public static int staticIntAdd(int x) {
        return  ++x;
    }

    public void nonStaticInfo() {
        x += 5;
        statX += 10;
        staticInfo();
        nonStatic2();
    }

    public void nonStatic2() {
        System.out.println("Hello");
    }
}
