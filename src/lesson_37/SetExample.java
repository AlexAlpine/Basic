package lesson_37;

import java.util.*;

public class SetExample {
    /*
    Контракт между hashCode() и equals()
    1. Если два объекта равны по методу equals, то их хеш-коды тоже должны быть равны
    2. Если хеш-коды двух объектов различны, то объекты точно не равны между собой.
    (Обратное не всегда верно - разные объекты могут иметь одинаковый хеш-код - коллизия)
     */


    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();

        List<Integer> startValues = List.of(15, 1, 2, 3, 3, 5, 8, 6, 8, 15, 7, 0, 16, 32, 64);
        System.out.println(startValues);

        // Не поддерживает порядок добавления элементов
        Set<Integer> integers = new HashSet<>(startValues);

        System.out.println("integers set: " + integers);

        //Сохраняет порядок добавления элементов
        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println("integers linked set: " + linkedSet);

        // boolean add(E e) - добавляет элемент
        System.out.println("integers.add(100): " + integers.add(100)); // true - элемент добавлен, т.к. еще не было такого значения
        System.out.println("integers.add(100) #2: " + integers.add(100)); // false - элемент НЕ добавлен, т.к. такое значение уже есть

        //boolean remove(Object obj)
        System.out.println("integers.remove(100): " + integers.remove(100)); // true
        System.out.println("integers.remove(100) #2: " + integers.remove(100)); // false

        //boolean contains(Object obj)
        System.out.println("integers.contains(33): " + integers.contains(33));

        /*
        int size()
        boolean isEmpty()
        clear() - удаляет все элементы
         */

        // iterator() - Возвращает итератор для элементов Set-a
        for (Integer value : integers) {
            System.out.print(value + ", ");
        }
        System.out.println();

        // Sorted Set конструкторы
        SortedSet<Integer> treeSet = new TreeSet<>(); // пустое, упорядоченное, множество (сортировка в естественном порядке)
        treeSet.addAll(startValues);
        treeSet.add(10);
        System.out.println("treeSet: " + treeSet);


        SortedSet<Integer> treeSet1 = new TreeSet<>(startValues); // Естественный порядок сортировки. Будут добавлены все уникальные элементы из коллекции
        System.out.println("treeSet1: " + treeSet1);

        // Конструетор с компаратором
        Set<Integer> treeSet2 = new TreeSet<>(Comparator.reverseOrder()); // Обратный порядок сортировки элементов
        treeSet2.addAll(startValues);
        System.out.println("treeSet2: " + treeSet2);

        Set<Integer> treeSet3 = new TreeSet<>((i1, i2) -> i2 - i1);
        Set<Integer> treeSet4 = new TreeSet<>((i1, i2) -> i2.compareTo(i1));
        treeSet3.addAll(startValues);
        treeSet4.addAll(startValues);
        System.out.println("treeSet3: " + treeSet3);
        System.out.println("treeSet4: " + treeSet4);

        System.out.println("\n====================================\n");

        // Написать метод, который принимает список (List) и возвращает список, состоящий только из уникальных элементов этого списка
        System.out.println("start Values: " + startValues);
        List<Integer> resultList = getUniqueList(startValues);
        System.out.println("result: " + resultList);


        //Написать метод, принимает список и возвращает список, состоящий из всех уникальных элементов, отсортированных в порядке убывания.

        System.out.println("reverse sorted list: " + getUniqueSortedList(startValues));
        System.out.println("reverse sorted list V2: " + getUniqueSortedListV2(startValues));

        //Todo показать методы интерфейса SortedSet


    }
    // метод, принимает список и возвращает список, состоящий из всех уникальных элементов, отсортированных в порядке убывания.
    public static <T> List<T> getUniqueSortedList(List<T> list) {
        // создать set, поддерживающий сортировку элементов в обратном порядке
        Set<T> treeSet = (Set<T>) new TreeSet<>(Comparator.reverseOrder());

        // добавить все элементы их списка в set, для получения уникальных и отсортированных элементов
        treeSet.addAll(list);

        // вернуть новый список, содержащий все элементы сет-а
        return new ArrayList<>(treeSet);
    }

    // метод, принимает список и возвращает список, состоящий из всех уникальных элементов, отсортированных в порядке убывания.
    public static <T extends Comparable<? super T>> List<T> getUniqueSortedListV2(List<T> list) {
        // создать set, поддерживающий сортировку элементов в обратном порядке
        Set<T> treeSet =  new TreeSet<>(Comparator.reverseOrder());

        // добавить все элементы их списка в set, для получения уникальных и отсортированных элементов
        treeSet.addAll(list);

        // вернуть новый список, содержащий все элементы сет-а
        return new ArrayList<>(treeSet);
    }


    //метод, который принимает список (List) и возвращает список, состоящий только из уникальных элементов этого списка
    public static <T> List<T> getUniqueList(List<T> list) {
        // получить set, состоящий из уникальных элементов списка
        Set<T> set = new LinkedHashSet<>(list);
        // вернуть новый список, содержащий все элементы сет-а
        return new ArrayList<>(set);
    }
}
