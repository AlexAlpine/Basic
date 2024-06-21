package lesson_25.linked_list;

import java.util.Iterator;

public class ItoratorExample {

    public static void main(String[] args) {

        MyLinkedList<String> strings = new MyLinkedList<>();
    strings.addAll("Java", "Hello", "Cat", "Orange", "Banana");

    strings.addFirst("Phyton");
        System.out.println(strings);

        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
        System.out.println("\n ========================= \n");

        for (String value : strings) {
            System.out.println(value);
        }
    }
}
