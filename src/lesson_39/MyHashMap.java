package lesson_39;

import java.util.Objects;

public class MyHashMap<K, V> implements InterfaceHashMap<K,V> {

    private Node<K, V>[] buckets;
    private int capacity = 16;
    private double loadFactor = 0.75;
    private  int size;

    public MyHashMap() {
        this.buckets = (Node<K, V>[]) new Node[capacity];
    }
    /*
    1. Вычислить хэш-код ключа
    2. На основание хэш-кода определить индекс корзины в массиве
    3. Если в корзине нет элементов - положить новую пару ключ-значение
    4. Если в корзине есть элементы: пройти по цепочке проверить ключи на совпадение
    4.1. Если найден совпадающий ключ - обновить значение для этого ключа
    4.2. Если не найдено совпадений - приклеить новую пару в конец списка
     */

    @Override
    public V put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> current = buckets[index];

        while (current != null) {

            //Todo Обработать ситуацию key == null

            // сверяю ключи
            if (current.key.equals(key)) {
                // п 4.1.
                current.value = value;
                return value;
            }

            // надо зафиксировать последнюю ноду, если она есть
            if (current.next == null) {
                // мы сейчас на последней ноде списка. И я хочу, чтобы ссылка current осталась на ней
                break;
            }

            current = current.next;
        }

        // прошелся по списку (если он есть) - совпадений ключей не нашел

        // Создаю новую пару ключ-значение
        Node<K, V> newNode = new Node<>(key, value);

        // проверяем наличие хотя бы одного элемента в корзине
        if (current == null) {
            // значит под индексом пустая ячейка (п.3)
            buckets[index] = newNode;
        } else {
            // в ячейка была как минимум 1 нода. Надо приклеить новую ноду в конец цепочки (п 4.2)
            current.next = newNode;
        }

        size++;

        // проверка загрузки
        if (1.0 * size / capacity >= loadFactor) {
            resize();
        }

        return value;
    }

    /*
    1. Получить хэш ключа. Вычислить индекс.
    2. Проверить список в ячейке.
    3. Если в корзине пусто - вернуть null (не нашли такого ключа в карте)
    4. Если что-то есть - пройтись - поискать совпадение ключей. Если найдено - вернуть значение
    5. Если прошли по всему списку и не нашли совпадений - вернуть null
     */

    @Override
    public V get(Object key) {
        int index = key.hashCode() & (capacity - 1);

        Node<K, V> current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    /*
    1. Получить индекс по хэш-коду
    2. Пройтись по цепочке, проверить ключи на равенство
     */
    @Override
    public boolean containsKey(Object key) {
        int index = key.hashCode() & (capacity -1);
        Node<K, V> current = buckets[index];
        while (current != null) {
            if (Objects.equals(current.key, key)) return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public void clear() {
        capacity = 16;
        buckets = (Node<K, V>[]) new Node[capacity];
        size = 0;
    }

    @Override
    public String toString() {
       /*
       1. Пройти по всем корзинам.
       2. Из каждой корзины добавить в строку список ее нод
        */
        StringBuilder sb = new StringBuilder("[");
        for (Node<K,V> node : buckets) {
            if (node != null) {
                sb.append(node.getList());
            }
        }
        return sb.append("]").toString();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        // TODO реализовать метод увеличение числа корзин и перераспределения нод
    }

    private int getIndex(K key) {
//        int hashCode = key.hashCode();
//        int index = Math.abs(hashCode) % capacity;

        // Побитовое И (&)

        int index = key.hashCode() & (capacity - 1);
        return index;

        // capacity = 8 // 1000 -> 0111
        // hcode = 19 // 10011 (0..7)

        /*
        10011
      & 0111
      -------
        00011 -> 3
         */



    }

    private static class Node<K,V> {
        private K key;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + key + " : " + value + "}";
        }

        public String getList() {
            Node<K,V> cursor = this;
            StringBuilder sb = new StringBuilder("[");
            while (cursor != null) {
                sb.append(cursor);
                sb.append(", ");
                cursor = cursor.next;
            }

            // Убираю ", " после полседней ноды
            sb.setLength(sb.length() -2);
            return sb.append("]").toString();
        }
    }
}
