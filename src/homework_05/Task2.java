package homework_05;

/*
Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.

Замените в результирующей строке слово "powerful" на "super".
Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
Выведите на экран значение этой переменной.

 */

public class Task2 {
    public static void main(String[] args) {
        String str = "Java";
        String str1 = "is";
        String str2 = "a";
        String str3 = "powerful";
        String str4 = "language";

        String space = " ";

        String concatStr = String.join(space, str, str1, str2, str3, str4);

        System.out.println(concatStr + "; длина: " + concatStr.length());

        concatStr = str.concat(space)
                .concat(str1).concat(space)
                .concat(str2).concat(space)
                .concat(str3).concat(space)
                .concat(str4);

        System.out.println(concatStr + "; длина: " + concatStr.length());


        concatStr = (str + space + str1).concat(space + str2 + space + str3).concat(space).concat(str4);
        System.out.println(concatStr + "; длина: " + concatStr.length());


        String result = concatStr.replace("powerful", "super");
        System.out.println(result);

//        Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?

        boolean isContain = result.contains("age");
        System.out.println("isContain: " + isContain);

        // indexOf

        int index = result.indexOf("age"); // если нет, вернет -1
        System.out.println("index: " + index);
        isContain = index != -1; // >= 0;

        System.out.println("Подстрока содержится в строке: " + isContain);


    }
}
