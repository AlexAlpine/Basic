package lesson_36;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        // Конструкторы ArrayList()
        List<Integer> list = new ArrayList<>(); // Создает список с начальной емкостью 10 элементов
        list = new ArrayList<>(50); // Создает пустой список с указанной емкостью.
        list = new ArrayList<>(List.of(1, -10, 5, 0, 25, -100)); // Создает список, содержащий все элементы указанной коллекции, в том порядке, в котором они возвращаются итератором коллекции


        // Конструкторы LinkedList
        list = new LinkedList<>(); // Создает пустой список
        list = new LinkedList<>(List.of(1, -10, 5, 0, 25, -100)); //Создает список, содержащий все элементы указанной коллекции


        // Методы интерфейса List


        // boolean add(E e) - Добавление элемента в конец списка
        list.add(1000);
        list.add(-100);
        list.add(-100);
        System.out.println("list: " + list);

        // void add(int index, E element) - добавление элемента на указанную позицию в списке
        list.add(2, 100);
        System.out.println("list: " + list);

        // E get(int index) - возвращает элемент по указанному индексу
        int value = list.get(5);
        System.out.println("list.get(5): " + list.get(5));

        // E remove (int index) - удаляет элемент по указанному индексу (возвращает значение удаленного элемента)
        System.out.println(list.remove(5));
        System.out.println("list: " + list);

        // Если я хочу удалить число -100 из списка? Как мне быть. Явное преобразование int в Integer
        list.remove(Integer.valueOf(-100));
        System.out.println("list: " + list);

        // Удалит все значения
        list.removeAll(List.of(-100));
        System.out.println("list: " + list);

        // int indexOf(Object 0) - возвращает индекс первого вхождения указанного элемента или -1, если элемента нет в списке
        System.out.println("list.indexOf(-100): " + list.indexOf(-100));
        System.out.println("list.indexOf(1000): " + list.indexOf(1000));

        // int lastIndexOf(Object 0) - возвращает индекс последнего вхождения указанного элемента или -1, если элемента нет в списке
        System.out.println("list.lastIndexOf(1000): " + list.lastIndexOf(1000));

        // List<E> subList(int indexFrom, int indexTo) - возвращает элементы списка от indexFrom до indexTo - (не включительно)
        List<Integer> subList = list.subList(1, 4); // 1, 2, 3 - индексы
        System.out.println("subList: " + subList);

        // Todo показать sort(Comparator)


    }
}
