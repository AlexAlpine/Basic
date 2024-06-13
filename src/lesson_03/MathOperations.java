package lesson_03;


public class MathOperations {
    public static void main(String[] args) {

        int var1 = 20;
        int var2 = 7;

        int result;

        // Сложение +
        result = 15 + 6;
        /*
        1. Вычисляться результат выражения, который находится справа от знака =
        2. Результат вычисления присваивается переменной, которая находится слева от знака равно.
         */

        System.out.println("Result: " + result);

        result = var1 + var2 + 100; // 20 + 7 + 100

        System.out.println("Result + : " + result);

        int var3 = 10;
        var3 = var3 + 5; // 10 + 5
        // var3 += 5;  // сокращенная запись такого присвоение ->  var3 = var3 + 5

        System.out.println("Var3: " + var3);
        var3 += 1; // var3 = var3 + 1

        // Инкремент (Добавить к текущему значению переменной 1)
        var3++; // var3 += 1; // var3 = var3 + 1
        System.out.println("var3: " + var3);


        // Переполнение типа
        byte byte1 = 127; // -128...127
        System.out.println("byte1: " + byte1);

        byte1++;

        System.out.println("Byte1: " + byte1); // Получаем -128


        // Вычитание -
        result = var1 - 11; // подставляет текущее значение var1 -> 20 - 11
        System.out.println("Result -: " + result);

        result = var1 - var2;

        int var4 = 100;
        var4 = var4 - 10; // 100 - 10 и результат присвоить в var4
        var4 -= 20; // короткая форма записи var4 = var4 - 20;
        System.out.println("Var4: " + var4);

        // Декремент
        var4--; // короткая форма записи для уменьшения значения переменной на 1; var4 = var4 - 1;
        System.out.println("Var4: " + var4);

        // Ctrl + Alt + L  - выравнивание / причесывание внешнего вида кода

        // Умножение *
        result = var1 * var2;

        System.out.println("Result *: " + result);
        result *= 2; // result = result * 2;
        System.out.println("result *= 2: " + result);

        // Целочисленное деление /
        result = var1 / var2; // Результатом будет целое число.
        // 20 / 7 = 2 целые и в остатке 6; Остаток в результате целочисленного деления отбрасывается
        System.out.println("Result /: " + result);

        int var5 = 5;

        result = var5 / 10; // 5 / 10 -> 0 целых и 5 в остатке.
        int rest = var5 % 10;

        System.out.println("Result: " + result + "; остаток равен: " + rest);

        // % - остаток от деления
        result = var1 % var2; // в результат операции будет равен остатку от целочисленного деления var1 / var2
        // 20 / 7 = 2 целых и 6 в остатке
        System.out.println("Остаток от деления 20 на 7: " + result);

        // 28 / 10  = 2 целых и 8 в остатке
        System.out.println((28 / 10)); // 2
        System.out.println((28 % 10)); // 8

        // Операция деления /. Только с числами с плавающей точкой

        double doubleVar = 20.0; // Все числа, записанные с . в коде считаются типом double
        double doubleSeven = 7.0d; // явно указывать, что число записано в формате double

        double resultDouble = doubleVar / doubleSeven;
        System.out.println("Результат деления в форматах double: " + resultDouble);

        // IEEE 754 - стандарт хранения чисел с плавающей точкой
        double x = 0.1; // 64 бита = 8 байтов.
        double y = 0.2;
        double z = x + y; // 0.3
        System.out.println("z: " + z);


    }
}
