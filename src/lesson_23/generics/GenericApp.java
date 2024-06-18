package lesson_23.generics;


import lesson_20.animals.Cat;

public class GenericApp {
    public static void main(String[] args) {


        GenericBox<String> box = new GenericBox<>("Hello");

        String str = box.getValue();
        System.out.println(str.length());
        System.out.println(str);

        box.setValue("Test");
        System.out.println(box);

        // GenericBox<int> box1 = new GenericBox<>(125);
        // Generics работают ТОЛЬКО со ссылочными типами данных
        // Т.е. НЕ работают с примитивами

        //Классы обертки

        GenericBox<Integer> box1 = new GenericBox<>(125);
        GenericBox<Integer> box2 = new GenericBox<>(100);
        System.out.println(box1);

        int sum = box1.getValue() + box2.getValue();
        System.out.println(sum);
    }
}