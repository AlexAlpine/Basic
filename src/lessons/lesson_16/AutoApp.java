package lessons.lesson_16;


public class AutoApp {
    public static void main(String[] args) {

        System.out.println(Auto.counter);

        Auto auto = new Auto("BMW", 200);
        auto.toString();

        int sum = MathUtils.sumOfInts(10, 25, 45, 34, 5546, 45);
        System.out.println("sum: " + sum);



//
//        System.out.println(auto.toString());
//
//        Auto auto1 = new Auto("VW", 150);
//
//        System.out.println(auto.toString());
    }
}

