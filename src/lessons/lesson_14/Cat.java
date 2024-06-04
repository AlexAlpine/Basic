package lessons.lesson_14;

public class Cat {

    String name;
    String color;
    int age;

    public Cat() {

    }

    public Cat(String catName) {
        name = catName;
    }

    public Cat(String catName, String color) {
        name = catName;
        this.color = color;
    }

    public Cat(String name, String color, int age) {
        this(name, color);
        this.age = age;

    }


    void sleep() {
        System.out.println("я сплю");
    }

    void run() {
        System.out.println("я бегу!");
    }
    void  sayMeow() {
        System.out.println("Meow");
    }
    void whoAmI() {
        System.out.println("I am Cat " + name + " мой возраст " + age + " мой окрас " + color);
    }

    }

