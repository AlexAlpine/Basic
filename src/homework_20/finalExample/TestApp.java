package homework_20.finalExample;


public class TestApp {

    public static void main(String[] args) {
        Base base = new Base();

        base.test();
        base.testNotFinal();

        Children children = new Children();

        children.test();
        children.testNotFinal();
    }
}