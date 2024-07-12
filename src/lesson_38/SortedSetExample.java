package lesson_38;


import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>(List.of(5, 1, 3, 8, 6, 4));
        System.out.println(sortedSet);

        // Методы интерфейса SortedSet

        // Возвращает компаратор, используемый для упорядочивания элементов коллекции
        // или null, если используется естественный порядок
        Comparator<Integer> comparator = (Comparator<Integer>) sortedSet.comparator();
        System.out.println(comparator == null);

        // first() - возвращает первый (наименьший) элемент множества
        System.out.println("sortedSet.first(): " + sortedSet.first());

        // last() - возвращает последний (наибольший) элемент множества
        System.out.println("sortedSet.last(): " + sortedSet.last());

        // headSet(E toElement) - возвращает представление части множества, элементы которого строго меньше toElement
        System.out.println(sortedSet.headSet(5)); // [1, 3, 4]

        // tailSet(E fromElement) - возвращает представление части множества, элементы которого больше или равны fromElement
        SortedSet<Integer> tailSet = sortedSet.tailSet(4);
        System.out.println("tailSet: " + tailSet);

        // subSet(E fromElement, E toElement) - возвращает представление части множества, элементы которого
        // находятся в диапазоне от fromElement (включительно) до toElement(не включительно)
        System.out.println("sortedSet.subSet(3, 8): " + sortedSet.subSet(3, 8)); // [3, 4, 5, 6]


    }
}
