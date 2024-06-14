package homework_20.finalExample;


// public final class Base { // final в объявлении класса запрещает наследование от этого класса
public class Base {

    public final void test() { // final в объявлении метода запрещает переопределять этот метод в наследниках
        System.out.println("Test");
    }

    public void testNotFinal(){
        System.out.println("Test not final");
    }

}