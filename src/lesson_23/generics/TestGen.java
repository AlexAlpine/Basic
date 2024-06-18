package lesson_23.generics;


public class TestGen <K,V>{
    private K key;
    private V value;

    public TestGen(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TestGen{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {
        TestGen<Integer, String> testGen = new TestGen<>(100, "Hello");
        int key = testGen.getKey();
        String value = testGen.getValue();
    }
}