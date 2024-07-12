package homework_36;

/*
Создайте два списка. Один на реализации ArrayList, второй на LinkedList.

Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.

Создайте 4 метода, принимающий реализацию интерфейса List.

В первом методе - получение всех значений элементов списка по его индексу
Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.

Сравните для каждого из списка время выполнения каждого метода.

И сравните время последовательного выполнения всех методов для каждой реализации List-а.
 */

import java.util.*;

public class CompareListsWorkTime {

    private static final int CAPACITY = 50_000;
    private static final int BOUND = 1000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        SortedSet<Integer> sortedSet;

        Random random = new Random();

        // Заполняем оба списка одинаковыми случайными значениями
        for (int i = 0; i < CAPACITY; i++) {
            int value = random.nextInt(BOUND);
            arrayList.add(value);
            linkedList.add(value);
        }
        sortedSet = new TreeSet<>(arrayList);

        long start = System.currentTimeMillis();
        arrayList.contains(2000);
        long end = System.currentTimeMillis();
        System.out.println("Время поиска arrayList: " + (end - start));

        start = System.currentTimeMillis();
        sortedSet.contains(2000);
        end = System.currentTimeMillis();
        System.out.println("Время поиска sortedSet: " + (end - start));



        start = System.currentTimeMillis();

        System.out.println("get array: " + getElements(arrayList));
        System.out.println("insert array: " + insertElements(arrayList));
        System.out.println("deleteByIndex array: " + deleteElementsByIndex(arrayList));
        System.out.println("deleteByValue array: " + deleteElementsByValues(arrayList));


        end = System.currentTimeMillis();

        System.out.println("\nОбщее время работы для ArrayList: " + (end - start));

        System.out.println("\n =========================== \n");
        start = System.currentTimeMillis();

        System.out.println("get linked: " + getElements(linkedList));
        System.out.println("insert linked: " + insertElements(linkedList));
        System.out.println("deleteByIndex linked: " + deleteElementsByIndex(linkedList));
        System.out.println("deleteByValue linked: " + deleteElementsByValues(linkedList));


        end = System.currentTimeMillis();

        System.out.println("\nОбщее время работы для LinkedList: " + (end - start));




    }

    // получение значений всех элементов списка по его индексу
    public static long getElements(List<Integer> integers) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < integers.size(); i++) {
            int value = integers.get(i);
        }

        long end = System.currentTimeMillis();
        return (end - start);
    }

    //вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
    public static long insertElements(List<Integer> list) {
        long start = System.currentTimeMillis();
        Random random = new Random();

        for (int i = 0; i < 10_000; i++) {
            list.add(random.nextInt(list.size()), random.nextInt(BOUND));
        }

        long end = System.currentTimeMillis();
        return (end - start);
    }

    //удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
    public static long deleteElementsByIndex(List<Integer> integers) {
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            integers.remove(random.nextInt(integers.size()));
        }

        long end = System.currentTimeMillis();
        return (end - start);
    }

    //Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
    public static long deleteElementsByValues(List<Integer> integers) {
        Random random = new Random();
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10_000; i++) {
            integers.remove(Integer.valueOf(random.nextInt(10000)));
        }

        long end = System.currentTimeMillis();
        return (end - start);
    }




}
