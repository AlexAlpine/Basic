package lesson_36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class CollectionExample {
    public static void main(String[] args) {

        // Интерфейс Collection гарантирует наличие базовых методов у всех расширяющих его интерфейсов.
        // Это позволяет единообразно обрабатывать различные типы коллекций.

        //Создали коллекцию строк
        Collection<String> strings = new ArrayList<>();

        // int size() - возвращает количество элементов в коллекции.
        System.out.println("strings.size(): " + strings.size());

        // boolean isEmpty() - возвращает true, если коллекция пустая.
        System.out.println("strings.isEmpty(): " + strings.isEmpty());

        // boolean add(T t) - добавляет элемент в коллекцию
        strings.add("Java");
        strings.add("Python");

        // Переопределен метод toString для красивого вывода элементов коллекции
        System.out.println(strings);

        // Метод .of() - это статический метод в нескольких интерфейсах и классах, начиная с Java 9
        // Создает неизменяемый экземпляр коллекции из предоставленных элементов
        // Доступен для List, Set, Map
        Collection<Integer> integers = List.of(1, 2, 3, 4, 5);
        System.out.println("integers: " + integers);
        // integers.add(6); - попытка модифицировать неизменяемую коллекцию приведет к ошибке (Исключению)


        // addAll(Collection<? extend T> c) - добавляет все элементы из указанной коллекции в текущую (сложение)
        strings.addAll(List.of("JS", "Banana", "Cat"));
        System.out.println("strings: " + strings);

        Collection<Integer> digits = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5)); // способ создания коллекции с какими-то начальными значениями
        System.out.println("digits: " + digits);

        // boolean remove(Object obj) - удаляет элемент из коллекции. Возвращает true, если такой элемент был
        System.out.println("digits.remove(6): " + digits.remove(6));
        System.out.println("digits.remove(4): " + digits.remove(4));
        System.out.println("digits: " + digits);

        // boolean containsAll(Collection<?> c) - возвращает true, содержит все элементы из указанной коллекции
        Collection<Integer> numbers = new ArrayList<>(List.of(3, 2, 1));
        System.out.println("digits.containsAll(numbers): " + digits.containsAll(List.of(1, 2, 3)));

        //boolean removeAll(Collection<?> c) - удаляет все элементы из коллекции вызова, содержащиеся в коллекции с (вычитание)
        System.out.println("digits.removeAll(List.of(1, 2, 3)): " + digits.removeAll(List.of(1, 2, 3)));
        System.out.println("digits: " + digits);

        numbers.removeAll(List.of(3, 2, 1));
        System.out.println(numbers);

        // boolean retainAll(Collection<?> b) - Оставляет в коллекции только те элементы, которые содержатся в указанной коллекции (пересечение)
        Collection<Integer> colA = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        Collection<Integer> colB = new ArrayList<>(List.of(20, 30, 40));
        colA.retainAll(colB);
        System.out.println("colA: " + colA);

        // void clear() - удаляет все элементы из коллекции
        colA.clear();
        System.out.println("colA: " + colA);

        // Object[] toArray() - возвращает массив, содержащий все элементы коллекции. Тип элементов массива Object!
        Object[] objects = colB.toArray();
        System.out.println("objects: " + Arrays.toString(objects));

        // <T> T[] toArray(T[] arr) - возвращает массив, содержащий все элементы коллекции
        // тип возвращаемого массива, определяется типом массива в параметрах вызова метода

        Integer[] ints = colB.toArray(new Integer[0]);
        System.out.println("ints array: "+Arrays.toString(ints));

        // boolean removeIf(Predicate<? super T> filter) - удаляет из коллекции все элементы по условию
        System.out.println("strings: " + strings);
//        strings.removeIf(s -> s.length() < 4); // удалит из коллекции все строки, длинна которых меньше 4

        // Анонимный класс (Имплементация интерфейса "на лету")
        Predicate<String> predicate = new Predicate<String>() {

            @Override
            public boolean test(String string) {
                return string.length() > 3; // для строк длиной больше 3 вернет true
            }
        };


//        strings.removeIf(predicate); // удалит из коллекции все строки, длинна которых меньше 4
        strings.removeIf(new PredicateImpl()); // удалит из коллекции все строки, которые начинаются на "J"

        System.out.println("strings: " + strings);

        Predicate<String> strPredicate = new PredicateImpl();

        Collection<Integer> numbersCol = new ArrayList<>(List.of(-1, 0, 10, -20, 11, 5, -26));
        // Удалить из коллекции все отрицательные числа (т.е. оставить все числа больше или равно 0)

        Predicate<Integer> isNegative = x -> x < 0;
        System.out.println("isNegative.test(10): " + isNegative.test(10)); // false
        System.out.println("isNegative.test(-10): " + isNegative.test(-10)); // true

        // Реализация на анонимном классе
//        numbersCol.removeIf(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer x) {
//                return x < 0;
//            }
//        });

        // Реализация лямбда-выражением
        numbersCol.removeIf(x -> x < 0);

        System.out.println("numbersCol: " + numbersCol);


    }
}
