package lesson_03;


public class Variables {
    public static void main(String[] args) {
        // Переименования класса или переменной - комбинация клавиш Shift + F6

        int myFirstVariable; // Объявление

        myFirstVariable = 10; // присвоение значения;

        System.out.println("Первое значение переменной: " + myFirstVariable);

        myFirstVariable = 25;

        System.out.println("Второе значение переменной:  " + myFirstVariable);

        byte byteVar; // объявляем переменную типа byte
        byteVar = -125; // инициализация переменной (присвоение значения первый раз)
        System.out.println("Значение переменной byteVar: " + byteVar);

        short shortVar = 31000; // объявление и инициализация переменной short
        System.out.println("Значение переменной типа short: " + shortVar);

        long longVar = 2_100_000_000_000_000_000L; // знак _ не влияет на значение переменной. Используется исключительно для улучшения читаемости числа человеком

        // Когда мы пишем в коде целое число, по умолчанию компилятор определяет его как тип int
        // L в конце числа - сказать компилятору, что число в формате long
        System.out.println("Число в формате long: " + longVar);

        double doubleVar = 10.5431; // разделитель в коде для чисел с плавающей запятой - ТОЧКА;

        System.out.println("doubleVar: " + doubleVar);

        float floatVar = 11.65f;

        System.out.println("floatVar: " + floatVar);

        // когда мы пишем в коде, число с запятой - компилятор воспринимает его как формат double
        // Чтобы явно указать, что число в формате float - после числа мы должны дописать букву f/F


    }
}
