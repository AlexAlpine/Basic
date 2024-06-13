package lesson_22.prinables;

public interface Printable {



    void print();

default void test() {
    System.out.println("Test");
}

static void testStatik(String str) {
    System.out.println("Statik test method");
}

}
