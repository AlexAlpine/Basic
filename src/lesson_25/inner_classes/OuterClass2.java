package lesson_25.inner_classes;

public class OuterClass2 {

    void myMethod() {
        class LocalInnerClass{
            void display() {
                System.out.println("Inside local inner class");
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.display();
    }

}
