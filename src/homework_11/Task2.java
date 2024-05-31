package homework_11;

public class Task2 {
    public static void main(String[] args) {
        double[] array = {45, 5, 55, 19, 5};
        System.out.println(aveElements(array));

    } // Method Area

    public static double aveElements(double[] array) {

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        double average = sum / array.length;

        return average;

    }
}
