package lesson_04;


public class PrintFormat {
    public static void main(String[] args) {

        double x = 20.0;
        double y = 7.0;

        double result = x / y;

        System.out.println("Result: " + result);

        // printf() - используется для форматированного вывода данных на консоль.
        // Он позволяет вставлять значения переменных в строку вывода по шаблону

        int age = 25;
        String name = "Alice";
        //Name: Alice, Age: 25
        System.out.printf("Name: %s, Age: %d\n\n\n\n", name, age); // \n - вставляет в текст символ перевода строки.
        System.out.printf("Name: %s, Age: %d\n", name, age);

        System.out.println("Hello"); // println - после вывода строки переводит курсор на новую строку
        /*
        %d - целое число (int)
        %f - число с плавающей точкой
        %s - текст (строка)
        %n - символ новой строки
        */

        System.out.printf("Result rounded %f\n", result); // генерация строки по сокращению souf
        // я могу указать в каком формате (сколько знаков после запятой) вывести число с плавающей точкой

        // result = 4.5;

        System.out.printf("Result rounded %.2f\n", result); // генерация строки по сокращению souf
        System.out.printf("Result rounded %.3f\n", result); // генерация строки по сокращению souf


    }
}
