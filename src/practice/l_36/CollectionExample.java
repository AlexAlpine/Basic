package practice.l_36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {


        Collection<String> strings = new ArrayList<>();

        System.out.println("strings.size()" + strings.size());

        System.out.println("strings.isEmpty()" + strings.isEmpty());

        strings.add("Java");
        strings.add("Python");

        System.out.println(strings);

        Collection<Integer> integers = List.of(1, 2, 3, 4, 5);
        System.out.println("integers" + integers);

        strings.addAll(List.of("JS", "Banana", "Cat"));
        System.out.println("strings" + strings);

        Collection<Integer> digits = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5));
        System.out.println(digits);

        System.out.println(digits.remove(6));
        System.out.println(digits.remove(4));
        System.out.println("digits" + digits);

        Collection<Integer> numbers =new ArrayList<>(List.of(3, 2, 1));
        System.out.println("digits.containsAll(numbers): " + digits.containsAll(numbers));

        System.out.println("digits.removeAll(List.of(1, 2, 3): " + digits.removeAll(List.of(1, 2, 3)));
        System.out.println(digits);

        Collection<Integer> colA = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        Collection<Integer> colB = new ArrayList<>(List.of(20, 30, 40));
        colA.retainAll(colB);
        System.out.println("colA" + colA);

        colA.clear();
        System.out.println("colA" + colA);

        Object[] objects = colB.toArray();
        System.out.println("objects: " + Arrays.toString(objects));

        Integer[] ints = colB.toArray(new Integer[0]);
        System.out.println("ints array: " + Arrays.toString(ints));

        System.out.println("strings.removeIf: " + strings.removeIf(s -> s.length() < 4));

        System.out.println("strings" + strings);










    }

}
