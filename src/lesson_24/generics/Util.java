package lesson_24.generics;

import homework_23.list.MagicList;

public class Util {

    // Менять местами два элемента
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Ограничение сверху Upper Bound
    // Ограничиваем диапазон принимаемых типов данных
    public  static <T extends Number> int sum (T... elements) {
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i].intValue();
        }

        return sum;
    }

    // ? - Wildcard - "неизвестный тип"
    // ? extends Number - "любой тип, являющийся наследником Number
    public static double listSum(MagicList<? extends Number> listNumber) {
        double sum = 0;
        for (int i = 0; i < listNumber.size(); i++) {
            sum += listNumber.get(i).doubleValue();
        }

        System.out.println("Сумма элементов: " + sum);
        return sum;
    }

    //Ограничение снизу (Lower Bound)
    public static void addNumbers(MagicList<? super Integer> list) {
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list);
    }




}
