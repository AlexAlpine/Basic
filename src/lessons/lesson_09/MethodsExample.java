package lessons.lesson_09;


public class MethodsExample {
    public static void main(String[] args) {

        sayHello();
        sayHello();
        sayHello();
        sayHello();

        String string = "Java";

        saySomething("World");

        saySomething(string);

        char ch = 'A';

        printDecimalCodeOfChar(ch);

        printDecimalCodeOfChar((char) 98);
        printDecimalCodeOfChar('c');

        int[] array = {1, 45, 67, 89, 443, 0, -24, 67};
        int[] array2 = {1, 2, 4, 5, 6, 7, 508, -570, 987, 453, 1111, 0, 34};

        printArray(array);

        printArray(array2);
        array2[3] = -1000;
        array2[0] = 1_000_000;

        printArray(array2);

        // Перегрузка методов - Method Overloading
        // 1. Написать метод, который выводит на экран числа от 1 до X
        // 2. Написать метод, который выводит на экран числа от A до B

        printNumbers(8);

        printNumbers(5, 11);

        printNumbers(10, "Hello");
        printNumbers("ChatGPT", 10);

        System.out.println("\n========================\n");

        int x = 100;

        changeMe(x);
        System.out.println("X = " + x);

        int[] digits = {0, 1, 2, 3, 4, 5};
        changeMe(digits);

        System.out.println("array[0] из Main: " + digits[0]);

        String str = "Java";
        changeMe(str);

        System.out.println("main: " + str);




    } // Methods area

    public static void changeMe(String str1) {
        String anotherString = str1.toUpperCase();
        System.out.println("anotherString: " + anotherString);
        System.out.println("method: " + str1);
    }

    public static void changeMe(int[] array) {
        array[0] = 100;
        System.out.println("array[0] из метода: " + array[0]);
    }

    public static void changeMe(int value){
        value = value + 500;
        System.out.println("new value: " + value);
    }

    public static void printNumbers(int a, String str) {
        System.out.println(a + " УРА! " + str);
    }

    public static void printNumbers(String str, int b) {
        System.out.println(str + ", мне одиноко! поговори со мной");
        System.out.println("Мне нужно хотя бы " + b + " истории");
    }

    public static void printNumbers(int a, int b) {
        for (int i = a; i <= b ; i++) {
            System.out.print(i  + " ");
        }
        System.out.println();
    }


    public static void  printNumbers(int range) {
        printNumbers(1, range);

//        for (int i = 1; i <= range; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
    }


    public static void printArray(int[] ints) {
        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ((i < ints.length - 1) ? ", " : "]\n"));
        }
    }

    public static void printDecimalCodeOfChar(char ch1) {
        System.out.println((int) ch1);
    }


    public static void sayHello() {
        // тело метода
        System.out.println("Hello");
        System.out.println("End of method");
    }

    public static void saySomething(String str) {
        System.out.println("Hello, " + str);
    }


} // end class
