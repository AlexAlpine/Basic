package lesson_25.linked_list;


import lesson_25.linked_list.MyLinkedList;

public class LinkedListApp {
    public static void main(String[] args) {

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        System.out.println(linkedList);

        linkedList.add(0);
        System.out.println(linkedList);

        linkedList.addFirst(-1);
        System.out.println(linkedList);

        linkedList.add(1);
        System.out.println(linkedList);

        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);

        linkedList.addFirst(-2);
        linkedList.addFirst(-3);
        System.out.println(linkedList);

        linkedList.addAll(7, 8, 9);
        System.out.println(linkedList);

        System.out.println("linkedList.size(): " + linkedList.size());
        System.out.println("linkedList.isEmpty(): " + linkedList.isEmpty());

        System.out.println("\n ========================= \n");
        linkedList.add(-1);
        System.out.println(linkedList);

        System.out.println("linkedList.indexOf(100): " + linkedList.indexOf(100));
        System.out.println("linkedList.indexOf(-1): " + linkedList.indexOf(-1));

        System.out.println("linkedList.lastIndexOf(-1): " + linkedList.lastIndexOf(-1));

        MyLinkedList<String> stringsList = new MyLinkedList<>();

        stringsList.addAll("Java");

        System.out.println("stringsList.lastIndexOf(Java): " + stringsList.lastIndexOf("Java"));
        System.out.println("stringsList.lastIndexOfV2(Java): " + stringsList.lastIndexOfV2("Java"));


        System.out.println(linkedList);
        Integer val = linkedList.get(15);
        System.out.println(val);
        System.out.println("\n ========================= \n");

        linkedList.addFirst(2);
        System.out.println(linkedList);

        linkedList.addLast(1);
        System.out.println(linkedList);








    }
}
