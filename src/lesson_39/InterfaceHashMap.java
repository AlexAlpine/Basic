package lesson_39;

public interface InterfaceHashMap<K, V>{
    // Положить в карту пару ключ-значение. Если ключ уже существует - обновить значение
    V put(K key, V value);

    // Взять из карты значение, соответсвующее ключу. Если ключ отсутствует - возвращаем null
    V get(Object key);

    //Удалить пару ключ-значение по значению
    // V remove(Object key);

    int size();

    boolean isEmpty();

    boolean containsKey(Object key);
    void clear();

    // Set всех ключей карты
    // Set<K> keySet();

    //Коллекция всех значений карты
    // Collection<V> values();

    // Взять из карты значение, соответсвующее ключу. Если ключ отсутствует - возвращаем defaultValue
    // V getOrDefault(Object key, V defaultValue);
}
