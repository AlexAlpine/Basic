package lesson_38;


import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> oldTable = new Hashtable<>(); // Устаревшая, медленная. Не рекомендуется использовать

        Map<Integer, String> map = new HashMap<>();

        // Добавить пару ключ-значение
        // Возвращает старое значение, соответствующее ключу ранее. Если не было такого ключа -> null
        map.put(1, "Hello");
        map.put(2, "Java");
        map.put(3, "World");
        System.out.println(map.put(4, "Orange"));
        String oldValueStr = map.put(4, "test");
        System.out.println("oldValueStr: " + oldValueStr);
        System.out.println("map: " + map);

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(0, "Python");
        map1.put(3, "Banana");
        System.out.println(map1);

        // putAll - принимает карту и копирует все пары ключ-значение из этой карты
        map.putAll(map1);
        System.out.println(map);

        // boolean containsKey(Object key) - возвращает true, если карта содержит указанный ключ
        // boolean containsValue(Object value) - возвращает true, если карта содержит одно или несколько таких значений
        System.out.println("map.containsKey(8): " + map.containsKey(8));
        System.out.println("map.containsValue(\"test\"): " + map.containsValue("test"));

        //get(Object key) - возвращает значение по ключу. Если нет ключа - вернет null
        System.out.println("map.get(1): " + map.get(1));
        System.out.println("map.get(8): " + map.get(8));

        // getOrDefault(Object key, V defaultValue)
        // возвращает значение по ключу. Если ключа нет - вернет defaultValue
        String value = map.getOrDefault(8, "Default");
        System.out.println("map.getOrDefault(8, \"Default\"): " + value );

        value = map.getOrDefault(1, "Default2");
        System.out.println("map.getOrDefault(2, \"Default2\"): " + value );

        // V remove(Object key) - удаляет пару ключ-значение. Возвращает значение или null
        System.out.println("map.remove(8): " + map.remove(8)); // ключа нет, вернется null
        System.out.println("map.remove(4): " + map.remove(4)); // ключа есть, вернется значение
        System.out.println("map: " + map);
        System.out.println("\n ========================= \n");

        // void clear() - очищает карту
//        map.clear();

        // int size() - возвращает кол-во элементов
        System.out.println("map.size(): " + map.size());

        //boolean isEmpty()
        System.out.println("map.isEmpty(): " + map.isEmpty());

        map.put(16, "Java");
        System.out.println(map);
        // Collection<V> values() - возвращает коллекцию всех значений карты
        Collection<String> values = map.values();
        System.out.println("map.values(): " + values);

        // Set<K> keySet() - возвращает set, состоящий из всех ключей карты
        Set<Integer> keys = map.keySet();
        System.out.println("keySet: " + keys);
        // могу перебрать все ключи в цикле и получить все значения
        for (Integer key : keys) {
            System.out.print(map.get(key) + "; ");
        }
        System.out.println();

        System.out.println("\n ========================== \n");

        // Set<Map.Entry<K, V>> entrySet - возвращает set (вхождений) представлений всех пар ключ-значения
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.print("entry.getKey(): " + entry.getKey());
            System.out.print(" - ");
            System.out.println("entry.getValue(): " + entry.getValue());
        }

        System.out.println("\n ===================== \n");
        System.out.println(map);
        // replace vs put

        // replace - если такого ключа нет, то новая пара НЕ создается. Если есть - значение будет перезаписано

        System.out.println("map.put(10, \"Red\"): " + map.put(10, "Red")); // put - если ключа нет - новая пара ключ-значение.
        System.out.println("map.put(10, \"Yellow\"): " + map.put(10, "Yellow")); // put - если ключ есть - значение будет перезаписано

        System.out.println("map.replace(11, \"Green\"): " + map.replace(11, "Green")); // replace - если ключа нет - НЕ создается новая пара ключ-значение.
        System.out.println("map.replace(10, \"Green\"): " + map.replace(10, "Green")); // replace - если ключ есть - значение будет перезаписано

        System.out.println(map);

        System.out.println("\n ====================== \n");
        // Перебор всех пар клю-значение. И возможность применять какую-то функцию к ним
        map.forEach((k, v) -> System.out.println("Key: " + k + "; value: " + v));







    }
}
