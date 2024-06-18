package lesson_25.inner_classes;

public class OuterClass1 {
    private static int staticOuterField = 42;
    private int instanceOuterField = 25;

    public class InnerClass {
        void display() {

            System.out.println("Inside inner class");
            System.out.println("Static outer field: " + staticOuterField);
            System.out.println("Instance outer field: " + instanceOuterField);
            //Тут доступ есть!

        }

    }

}
