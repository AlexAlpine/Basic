package lesson_20.animals;
/*
@date 11.06.2024
@author Sergey Bugaienko
*/

public class Cat extends Animal {

    // выдается "из коробки", если я не написал ни одного своего конструктора в классе
//    public Cat(){
//        super();
//    }

    // переопределение родительского метода voice()
    @Override
    public void voice() {
        System.out.println("Cat say MEOW!!!");
    }

    // Уникальный функционал кота
    public void eat() {
        System.out.println("Cat eating");
    }

    @Override
    public String toString() {
        return "Cat";
    }
}