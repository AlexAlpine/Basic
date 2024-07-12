package homework_40;

/*
Создайте цепочку функций, которая
сначала удаляет пробелы из строки,
затем преобразует её в верхний регистр, и в конце
считает количество символов в измененной строке
 */

import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {

        String string = "He , wor  ld";

        Function<String, String> function = str -> str.replaceAll("\\s+", "");
        Function<String, String> function1 = String::toUpperCase;
        Function<String, Integer> function2 = String::length;

        Function<String, Integer> combineFunc = function.andThen(function1).andThen(function2);

        System.out.println(combineFunc.apply(string));


    }
}