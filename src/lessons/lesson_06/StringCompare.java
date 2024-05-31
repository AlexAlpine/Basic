package lessons.lesson_06;

public class StringCompare {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JaVa";
        String str4 = new String("Java");

        System.out.println(str1);
        System.out.println(str4);

        System.out.println("str1 == str2 -> " + (str1 == str2));
        System.out.println("str1 == str3 -> " + (str1 == str3));
        System.out.println("str1 == str4 -> " + (str1 == str4));

        System.out.println("str1.equals(str2) -> " + str1.equals(str2));
        System.out.println("str1.equals(str4) -> " + str1.equals(str4));
        System.out.println("str1.equals(str3) -> " + str1.equals(str3));


    }
}
