package lessons.lesson_06;


public class BooleanExample {
    public static void main(String[] args) {


        // Логическое НЕ - меняет значение на противоположное

        boolean boolVar = true;
        System.out.println(!boolVar);


        // Логическое И
        boolean and = true & true; // только если ОБА условия истинны - будет true
        System.out.println("true & true" + and);

        and = (2 < 5) & (11 < 10); // -> false
        System.out.println("b1:" + and);


        // Логическое ИЛИ / OR
        boolean or = true | false; // если ХОТЯ БЫ ОДНО условие будет true - результат будет true
        System.out.println("true | false: " + or);
        System.out.println("true | true: " + (true | true)); // true
        System.out.println("false | false: " + (false | false)); // false




        // XOR - Логическое исключающее ИЛИ
        // По сути, возвращает true, если операнды — разные.
        boolean xor = true ^ false;
        System.out.println("true ^ false -> " + xor); // true
        System.out.println("false ^ true -> " + (false ^ true)); //true
        System.out.println("true ^ true -> " + (true ^ true)); //false
        System.out.println("false ^ false -> " + (false ^ false)); //false

        // && -  Логическое сокращенное И
        boolean and1 = true && true; // только если ОБА условия истинны - будет результат true
        System.out.println("true && true -> " + (true && true) ); // true
        System.out.println("true && false -> " + (true && false) ); //false

        int a = 2;
        int b = 10;

        //                  a=2 - true --> надо считать правую часть
        //                  a=0-> false      правая часть не имеет влияния на результат
        boolean greatThat =  (a != 0)  && (b / a > 3); //
        System.out.println("greatThat: " + greatThat);

        // || - логическое сокращенное или -
        // если ХОТЯ БЫ ОДНО условие будет true - результат будет true
//                    a=0 true
        boolean test = (a == 0) || (b / a > 3);
        System.out.println(test);

        System.out.println("\n======================\n");
        /*
        ! - & - ^ - | - && - ||

         */
        System.out.println(true ^ true & false);
        System.out.println(true ^ false);
        System.out.println(true);


        System.out.println(true ^ true && false);
        System.out.println(false && false);
        System.out.println(false);


        // ! - & - ^ - | - && - ||
        System.out.println(true || false ^ true & !true);
        System.out.println(true || false ^ true & false);
        System.out.println(true || false ^ false);
        System.out.println(true || false);
        System.out.println(true );


    }
}
