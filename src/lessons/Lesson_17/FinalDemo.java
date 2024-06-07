package lessons.Lesson_17;


public class FinalDemo {

    public static final double PI = 3.141519; // Константа
    public static final int[] INTS = new int[10]; // Не является константой, т.к. состояние объекта (значения в массиве) могут быть изменены.
    public static final String COUNTRY = "Germany"; // Константа, т.к. невозможно изменить значение строки (состояние объекта)
    public static final String[] colors = {"blue", "red", "yellow"}; // Не константа, т.к. значения можно перезаписать

    private final int x;
    private final int[] array;

    public FinalDemo(int x, int[] array) {
        this.x = x;
        this.array = array;
        array[0] = 15;
        array[array.length -1] = 100;
        colors[0] = "Green";

    }

    public void test (final int number) {
//        number += 10; нельзя изменить значение, т.к. в параметрах метода переменная помечена как final
        int x = number + 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = x++;
        }
    }

    public void test2 (final int[] ints) {
//        ints = new int[10]; нельзя присвоить новую ссылку
        int[] newArray = ints; // можно
        ints[0] = 15;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        // this.x = x; //Нельзя изменить значение final поля после инициализации
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        // this.array = array; Нельзя переприсвоить ссылку
    }
}
