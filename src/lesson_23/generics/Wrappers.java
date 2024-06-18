package lesson_23.generics;

public class Wrappers {

    //Классы-обертки используются в Java для представления примитивных типов данных как объектов.

    /*
    Byte - обертка для byte
    Short - обертка short
    Integer - обертка int
    Long - обертка long
    Float - обертка float
    Double - обертка double
    Character - обертка char
    Boolean - обертка boolean
     */

    public static void main(String[] args) {

        Integer maxValue= Integer.MAX_VALUE;
        System.out.println("max: " + maxValue);
        System.out.println("min: " + Integer.MIN_VALUE);

        maxValue = null;

        // Автоматическое приведение типов
        // Автоупаковка и автораспаковка

        Integer wrapperInt = 5; // автоупаковка примитива int в ссылочный тип Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; //Автораспаковка. Из типа Integer автоматически преобразовало в примитив int

        // Сравнение объектов
        // -128...127

        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b); // true
        System.out.println(a.equals(b)); // true

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d); // false
        System.out.println(c.equals(d)); //true

        // Схожие методы для всех оберточных типов
        // 1. valueOf() - преобразует явным образом примитив или строку в объект типа обертки

        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf(127);
        System.out.println("value of == " + (e == f));

        Integer intStr = Integer.valueOf("123");
        System.out.println(intStr + 100); // 223

        Double do1 = Double.valueOf(154.5);

        // 2. parseXXX() - преобразует строку в соответсвующий примитив
        System.out.println(Integer.parseInt("456") + 100);
        double d1 = Double.parseDouble("344.56") + 200;
        System.out.println(d1);

        // System.out.println(Integer.parseInt("Rrr")); // если из строки не получится извлечь число - будет выброшено исключение (ошибка)

        // 3. toString - возвращает строковое представление числа
        String strNumber = intStr.toString();
        System.out.println(strNumber + 10); // 12310 - конкатенация строк (а не операция сложения)

        // equals - сравнивает два объекта по значению

        //compareTo - сравнивает текущий объект с другим объектом того же типа (кто больше?)
        System.out.println(e.compareTo(f)); // 127 vs 127 -> 0
        System.out.println(e.compareTo(128)); // 127 vs 128 -> отрицательное

        // xxxValue() - возвращает значение объекта как примитивный тип

        Double d2 = Double.valueOf(125.67); // Явная / принудительная упаковка
        double dPrimitive = d2.doubleValue(); // Явная / принудительная распаковка

        // Все числовые обертки над примитивами наследуются от абстрактного класса Number.
        // Byte, Short, Integer, Long, Float, Double

        /*
        byteValue()
        shortValue()
        intValue()
        longValue()
        floatValue()
        doubleValue()
         */

        Integer integer = 31844;
        Double dblValue = 245.78;


        System.out.println(integer.doubleValue());

        short sh = integer.shortValue();

        int intFromDouble = dblValue.intValue();

        System.out.println(sh);
        System.out.println(intFromDouble);

    }
}