package lesson_15;


public class TestArray {
    public static void main(String[] args) {

        MagicArray magicArray = new MagicArray();

        magicArray.add(10);
        magicArray.add(50);
        magicArray.add(77);

        magicArray.add(25, 11, 5, 100, -50, 44, 22, 17, 19);

        System.out.println(magicArray.toString());

        System.out.println("size: " + magicArray.size());

        int value = magicArray.get(4);
        System.out.println("value: " + value);
        System.out.println(magicArray.get(11));
        System.out.println(magicArray.get(12));

        magicArray.remove(4);
        System.out.println(magicArray.toString());

        int[] array = {1, 2, 3};


        magicArray.add(15, 156, 64, 43);
        System.out.println(magicArray.toString());

    }
}