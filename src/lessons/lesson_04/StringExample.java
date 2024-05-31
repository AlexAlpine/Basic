package lessons.lesson_04;


public class StringExample {
    public static void main(String[] args) {
        String string = "Java"; // Объявление и инициализация переменной типа String.

        String string1 = new String("Hello"); // Тоже создание новой строки.

        System.out.println(string);

        // название метода с круглыми скобками - вызов метода.
        System.out.println(string.length()); // количество символов в строке (длина строки)

        // Метод позволяет перевести все символы строки в верхний регистр
        System.out.println(string.toUpperCase()); // перевести все символы строки в верхний регистр
        System.out.println("String: " + string);

        // Стринг - иммутабельна (неизменна)
        String stringUpper = string.toUpperCase(); // если я хочу сохранить результаты работы метода - я должен сохранить их в какую-то переменную.

        System.out.println("String: " + string);
        System.out.println("stringUpper: " + stringUpper);

        // toLowerCase() - переводит все символы строки в нижний регистр
        stringUpper = stringUpper.toLowerCase();

        System.out.println("stringUpper: " + stringUpper);





    }
}
