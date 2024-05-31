package homework_10;

/*
Написать метод, принимающий на вход массив строк.

Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */

public class Task2 {
    public static void main(String[] args) {

        String[] strings = {"One", "Java", "Python", "JS", "hello"};

        String[] res = getArraySmallestString(strings);
        printArray(res);

        System.out.println("\n =================== testArray = null ============= \n");
        String[] strings1 = null;
        String[] res1 = getArraySmallestString(strings1);
        printArray(res1);

        System.out.println("\n============ null in array");
        String[] strings2 = {"One", "Java", null, "JS", "hello"};
        String[] res2 = getArraySmallestString(strings2);
        printArray(res2);

        System.out.println("\n ======== null in array is First");
        String[] strings3 = {null, null, null, null};
        String[] res3 = getArraySmallestString(strings3);
        printArray(res3);




    } // Method area

    public static String[] getArraySmallestString(String[] strings) {

        if (strings == null || strings.length == 0) {
            return new String[0]; // {null, null}
        }

        String notNullValue = findFirstNotNullValueInArray(strings);

        if (notNullValue == null) {
            return new String[0];
        }

        String minLen = notNullValue;
        String maxLen = notNullValue;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null  && strings[i].length() <  minLen.length()) {
                minLen = strings[i];
            }

            if (strings[i] != null && strings[i].length() > maxLen.length()) {
                maxLen = strings[i];
            }
        }


        return new String[] {minLen, maxLen};
    }

    public static String findFirstNotNullValueInArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                return strings[i];
            }
        }

        return null;
    }

    public static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((i < arr.length -1 ) ? ", " : "]\n"));
        }
        if (arr.length == 0) System.out.println("]");
    }

}
