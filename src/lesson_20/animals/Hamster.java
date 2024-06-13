package lesson_20.animals;
/*
@date 11.06.2024
@author Sergey Bugaienko
*/

public class Hamster extends Animal {

    @Override //Аннотация
    //Переопределение родительского метода - динамический полиморфизм
    public void voice() {
        System.out.println("Hamster say Hrum-hrum");
    }

    // Перегрузка метода - статический полиморфизм
    public void voice(String str) {
        System.out.println("Hamster say: " + str);
    }
}