package lessons.lesson_14;

public class MainDog {
    public static void main(String[] args) {

        Dog dog = new Dog("Bim", 5);

        dog.printInfo();

        dog.run();
        dog.run();
        dog.run();
        dog.run();


        dog.printInfo();
    }
}
