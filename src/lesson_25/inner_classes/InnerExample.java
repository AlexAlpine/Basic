package lesson_25.inner_classes;

public class InnerExample {

    public static void main(String[] args) {

        OuterClass.StatikNestedClass nestedObject = new OuterClass.StatikNestedClass();
        nestedObject.display();

        OuterClass1 outerObject = new OuterClass1();
        OuterClass1.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.display();

        OuterClass2 outerObject2 = new OuterClass2();
        outerObject2.myMethod();


    }

}
