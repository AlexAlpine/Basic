package lessons.lesson_14;

public class Lesson_14 {
    public static void main(String[] args) {

        Cat cat = new Cat();


        cat.sayMeow();
        cat.run();
        cat.sleep();

        String name = cat.name;
        System.out.println("Имя: " + name);

        System.out.println("\n ============\n");

        Cat cat1 = new Cat("Max ");
        System.out.println("name: " + cat1.name);

        cat1.whoAmI();

        Cat cat2 = new Cat("diamond", "red");
        System.out.println("cat2.name: " + cat2.name);
        System.out.println("cat2.color: " + cat2.color);

        System.out.println("\n ============\n");


        Cat cat3 = new Cat("Tom", "Black", 2);
        cat3.whoAmI();

        Cat cat4 = cat3;
        cat4.whoAmI();

        System.out.println("\n ======New Cat4======\n");

        cat4 = new Cat("Bim", "white", 5);

        cat4.whoAmI();
        cat3.whoAmI();


    }
}
