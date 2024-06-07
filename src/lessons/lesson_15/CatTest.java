package lessons.lesson_15;

public class CatTest {
    public static void main(String[] args) {

        Cat15 cat =new Cat15("Catty", 8, 5);

        cat.sayMeow();



        String catName = cat.getName();

        cat.setAge(10);
    }
}
