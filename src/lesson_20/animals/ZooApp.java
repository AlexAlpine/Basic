package lesson_20.animals;
/*
@date 11.06.2024
@author Sergey Bugaienko
*/

public class ZooApp {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.voice();

        Cat cat = new Cat();
        cat.eat();
        cat.voice();

        Hamster hamster = new Hamster();
        hamster.voice();
        hamster.voice("Hello!");

        Dog dog = new Dog();
        dog.voice();

        // Переопределение методов



    }
}