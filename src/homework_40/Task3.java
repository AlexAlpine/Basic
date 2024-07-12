package homework_40;


/*
Напишите BiConsumer, который принимает ключ и значение, а затем печатает их в формате "ключ=значение
 */

import java.util.function.BiConsumer;

public class Task3 {
    public static void main(String[] args) {

        BiConsumer<Integer, String> biConsumer = (key, value) -> System.out.println(key + "=" + value);
        biConsumer.accept(1, "Test");
    }
}