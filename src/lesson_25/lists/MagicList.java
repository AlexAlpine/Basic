package lesson_25.lists;


import homework_23.list.MyList;

import java.lang.reflect.Array;

public class MagicList<T> implements MyList<T> {
    private T[] array;
    private int cursor; // присвоено значение по умолчанию - 0


    @SuppressWarnings("unchecked") // Подавляю предупреждение компилятора о непроверяемом приведении типа
    public MagicList() {
        // Приведение массива объектов к массиву типа Т
        array = (T[]) new Object[10];
    }

    /*

     */

    @SuppressWarnings("unchecked")
    public MagicList(T[] array) {
        if (array != null) {
            this.array = (T[]) new Object[array.length * 2];
            addAll(array);

        } else {
            this.array = (T[]) new Object[10];
        }
    }


    // Добавляют в массив один элемент
    @Override
    public void add(T value) {
        // Добавлять значение в наш массив

        // Проверка. Есть ли вообще место во внутреннем массиве?
        if (cursor == array.length - 1) {
            expandArray();
        }

        array[cursor] = value;
        cursor++;
    }

    @SuppressWarnings("unchecked")
    //Динамическое расширение размера массива
    private void expandArray() {
//        System.out.println("Расширяем массив! " + cursor);
        /*
        1. Создать новый массив бОльшего размера (в 2 раза больше)
        2. Переписать в новый массив все (значимые) значения из старого
        3. Перебросить ссылку
         */

        T[] newArray = (T[]) new Object[array.length * 2]; // создаю новый массив, в 2 раза больше текущего array

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // Переписываю все значения из старого в новый
        }

        // Перебросить ссылку. Переменная array хранила ссылку на "новый" массив
        array = newArray;
//        System.out.println("Расширение массива завершено! ");
    }

    @Override
    // Добавляет в массив несколько элементов
    public void addAll(T... values) {
        // numbers - я могу обращаться точно также, как со ссылкой на массив

        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }

    @Override
    // Текущее количество элементов в массиве
    public int size() {
        return cursor;
    }


    @Override
    // Поиск первого вхождения элемента по значению
    public int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) return i;
        }

        return -1;
    }

    @Override
    // Поиск последнего вхождения элемента по значению
    public int lastIndexOf(T value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i].equals(value)) return i;
        }

        return -1;
    }


    @Override
    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    @Override
    // Возвращает значение по индексу
    public T get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        } else {
            return null;
        }
    }

    @Override
    //Замена значения по индексу (есть индекс и новое значение)
    public void set(int index, T value) {
        if (!(index >= 0 && index < cursor)) {
            return;
        }

        array[index] = value;

    }


    @Override
    // Удаление по индексу
    public T remove(int index) {
        /*
        1. Проверка индекса на валидность
        2. Удалить значение по этому индексу
        3. Передвинуть курсор (т.к. кол-во элементов уменьшилось)
         */

        if (index < 0 || index >= cursor) {
            //индекс не валидный. Ничего в массиве не трогаем
            return null;
        }

        T value = array[index];

        for (int i = index; i < cursor - 1; i++) {
            array[i] = array[i + 1];
        }
        cursor--;

        return value;
    }


    @Override
    //Удаление элемента по значению
    public boolean remove(T value) {
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

    @Override
    public boolean isEmpty() {
        return cursor == 0;
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


    @SuppressWarnings("unchecked")
    // Вернуть наш магический массив в виде обычного массива
    public T[] toArray() {

        if (cursor == 0) return null;
        // Используем рефлексию для определения типа элементов нашего массива
        Class<T> clazz = (Class<T>) array[0].getClass();
        System.out.println("clazz: " + clazz);

        // Создаем массив того же типа, как 0-й элемент в нашем массиве
        T[] result = (T[]) Array.newInstance(clazz, cursor);

        for (int i = 0; i < result.length; i++) {
            result[i] = array[i];
        }

        return result;
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