package lesson_23.generics;

public class GenericBox <T> {

    private T value;

    public GenericBox(T value) {
        this.value = value;

    }

    public T getValue() {
        return value;

    }

    public void setValue(T value) {
        this.value = value;

    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value=" + value +
                '}';
    }

}
