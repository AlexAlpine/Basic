package lesson_20.animals;
/*
@date 11.06.2024
@author Sergey Bugaienko
*/

public class Animal {


    public void voice() {
        System.out.println("Animal say something");
    }

    @Override
    public String toString() {
        return "Animal toStr";
    }
}