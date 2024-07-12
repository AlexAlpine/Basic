package lesson_39;


public class MapApp {
    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<>();
        map.put(5, "Java");
        map.put(21, "Hello");
        map.put(7, "Python");
        map.put(21, "JS");
        map.put(-7, "Negative");
        System.out.println(map);

        System.out.println("map.size(): " + map.size());

        String value = map.get(21);
        System.out.println("value: " + value);
        System.out.println("map.get(\"Java\"): " + map.get("Java"));
        System.out.println("map.get(-7): " + map.get(-7));
    }
}
