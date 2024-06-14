package lesson_15;


public class MagicArray {
    private int[] array;
    private int cursor; // присвоено значение по умолчанию - 0

    public MagicArray() {
        array = new int[10];
    }

    public MagicArray(int[] array) {

        if (array != null) {
            this.array = new int[array.length * 2];
            add(array);

        } else {
            this.array = new int[10];
        }
    }

    // Добавляют в массив один элемент
    public void add(int value) {
        // Добавлять значение в наш массив

        // Проверка. Есть ли вообще место во внутреннем массиве?
        if (cursor == array.length - 1) {
            expandArray();
        }

        array[cursor] = value;
        cursor++;
    }

    //Динамическое расширение размера массива
    private void expandArray() {
        System.out.println("Расширяем массив! " + cursor);
        /*
        1. Создать новый массив бОльшего размера (в 2 раза больше)
        2. Переписать в новый массив все (значимые) значения из старого
        3. Перебросить ссылку
         */

        int[] newArray = new int[array.length * 2]; // создаю новый массив, в 2 раза больше текущего array

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // Переписываю все значения из старого в новый
        }

        // Перебросить ссылку. Переменная array хранила ссылку на "новый" массив
        array = newArray;
        System.out.println("Расширение массива завершено! ");
    }


    // Добавляет в массив несколько элементов
    public void add(int... numbers) {
        // numbers - я могу обращаться точно также, как со ссылкой на массив

        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }
    }

    // Текущее количество элементов в массиве
    public int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    public int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        } else {
            return Integer.MIN_VALUE; // хорошего решения нет на этой стадии
            // TODO Поправить обработку не корректного индекса
        }
    }

    public int remove(int index) {
        /*
        1. Проверка индекса на валидность
        2. Удалить значение по этому индексу
        3. Передвинуть курсор (т.к. кол-во элементов уменьшилось)
         */

        if (index < 0 || index >= cursor) {
            //индекс не валидный. Ничего в массиве не трогаем
            return Integer.MIN_VALUE; //Todo
        }

        int value = array[index];

        for (int i = index; i < cursor - 1; i++) {
            array[i] = array[i + 1];
        }
        cursor--;

        return value;
    }

    //Удаление элемента по значению
    public boolean removeByValue(int value) {
        /*
        1. Есть ли такой элемент у нас в массиве - indexOf
        2. Если эл. нет - вернуть false
        3. Если есть - использовав его индекс удалить методом remove
         */

        int index = indexOf(value);
        // Ctrl + Alt + <- - вернуть курсор на предыдущую позицию

        if (index == -1) return false;

        remove(index);
        return true;
    }


    // Возвращает строковое представление массива
    public String toString() {
        if (cursor == 0) return "[]";

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < cursor; i++) {
            sb.append(array[i]).append((i < cursor - 1) ? ", " : "]");
        }
        return sb.toString();
    }

    // Поиск первого вхождения элемента по значению
    public int indexOf(int value) {

        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) return i;
        }

        return -1;
    }

    // Поиск последнего вхождения элемента по значению
    public int lastIndexOf(int value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == value) return i;
        }

        return -1;
    }

    // Вернуть наш магический массив в виде обычного массива
    public int[] toArray() {
        int[] result = new int[cursor];

        for (int i = 0; i < result.length; i++) {
            result[i] = array[i];
        }

        return result;
    }

    //Замена значения по индексу (есть индекс и новое значение)
    public int set(int index, int value) {
        /*
        1. Валидация индекса 0...cursor
        2. Вытащить старое значение
        3. Записать новое значение
        4. Вернуть старое из метода
         */

//        if ((index < 0 || index >= cursor)) {
        if (!(index >= 0 && index < cursor)) {
            // Индекс не прошел валидацию
            return Integer.MIN_VALUE;
            // Todo поправить обработку не валидности
        }

        int oldValue = array[index];
        array[index] = value;
        return oldValue;
    }
}


/*
1. Добавлять в массив элемент ++
2. Динамическое изменение состояния массива (размера) ++
3. Возвращать строковое представление массива ++
4. Добавлять в массив сразу несколько значений ++
5. Текущее количество элементов в массиве ++
6. Возвращает значение по индексу ++
7. Удаление элемента по индексу (Есть индекс - удалить этот элемент из массива). Вернуть старое значение ++

8. Конструктор, который принимает массив и создает MagiArray с такими же значениями ++
9. Удаление элемента по значению remove ByValue() ++
10. Поиск элемента по значению - вернуть индекс indexOf() ++
11. Замена значения по индексу (есть индекс и новое значение) ++
12. Вернуть наш магический массив в виде обычного массива -> int[] toArray() ++
 */