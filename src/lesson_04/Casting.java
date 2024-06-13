package lesson_04;


public class Casting {
    public static void main(String[] args) {
        // Два вида преобразования в Java: явное и неявное преобразование


        //Неявное происходит автоматически, когда значение меньшого типа данных
        // преобразуется в больший тип данных

        byte byteVal = 123; // -128 ... 127
        int intVal;
        intVal = byteVal; // неявное преобразование типа byte в тип int

        int intValue = 42;
        double doubleValue = intValue; // Неявное преобразование int в double.

        System.out.println(intValue);
        System.out.println(doubleValue);

        // Явное преобразование
        // Требуется, когда нужно преобразовать значение большегО типа данных в значение меньшего,
        // поскольку это может привести в потере данных


        double double1 = 42.9;
        int int1 = (int) double1; // Явное преобразование double в int

        System.out.println("double1: " + double1);
        System.out.println("int1: " + int1);

        // Преобразование в вычислениях

        int x = 20;
        int y = 7;

        double result;

        result = x / y;
        System.out.println("result: " + result);

        result = x / 7.0; // когда в выражении (в формуле) присутствует хотя бы один тип с плавающей точкой(double / float)
        // все остальные целочисленные типы в этом выражении автоматически кастируются к типу double
        // 20.0 / 7.0 - обычное деление. Результат которого будет число в формате double
        System.out.println("result: " + result);

        result = (float) x / y; // будет произведено обычное деление (НЕ целочисленное)
        System.out.println("Float result: " + result);

        result = x / (double) y; //  числитель тоже будет приведен к типу double
        System.out.println("Result float: " + result);

    }
}
