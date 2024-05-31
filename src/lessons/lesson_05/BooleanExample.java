package lessons.lesson_05;


public class BooleanExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        boolean boolVar = true; // истина / правда
        boolVar = false; // ложь / НЕ-правда

        // == сравнивает на равенство
        boolVar = (x == y); // X равен Y -> 10 равно 5 -> false
        System.out.println(x + " == " + y + " -> " + boolVar);

        // != сравнивает на неравенство
        boolVar = x != y; // X не равно Y -> 10 не равно 5 -> true
        System.out.println(x + " != " + y + " -> " + boolVar);

        x = 10;
        y = 10;

        boolVar = x > y; // X больше чем Y -> 10 больше чем 10 -> false
        System.out.println(x + " > " + y + " -> " + boolVar);

        boolVar = x >= y; // X больше или рано Y -> 10 больше или равно 10 -> true
        System.out.println(x + " >= " + y + " -> " + boolVar);

        x = 10;
        y = 7;
        boolVar = x < y; // X меньше Y -> false
        System.out.println(x + " < " + y + " -> " + boolVar);

        boolVar = x <= y; // X меньше или равно Y -> false
        System.out.println(x + " <= " + y + " -> " + boolVar);


        System.out.println("\n ======================= \n");

        //Логическое НЕ - меняет значение boolean на противоположное

        boolVar = !(4 == 5);
        System.out.println("!(" + x + " == " + y + ") -> " + boolVar);
//        System.out.println("!(" + x + " == " + y + ") -> " + !boolVar);

        boolVar = true;
        System.out.println(!boolVar);

        // Логическое И / AND

        // Рим столица Италии И Берлин столица Франции. ->
        // true И true -> true
        // true И false -> false
        boolean b1 = true & true;
        System.out.println("true & true -> " + b1);

        b1 = (2 < 5) & (11 == 10);
        System.out.println("(2 < 5) & (11 == 10) -> " + b1);

        // Чтобы получить true обе части выражения с логическим и (&) должны быть true.


    }
}
