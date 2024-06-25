package lesson_20.animals;


public class CastingExample {
    public static void main(String[] args) {

        Animal animal = new lesson_20.animals.Hamster(); // здесь тип Hamster автоматически преобразуется к типу Animal


        animal.voice();

        Animal animal1 = new Dog(); //Восходящее НЕ явное преобразования
        animal1.voice();

        Animal animal2 = new Cat();
        animal2.voice();

        System.out.println("\n============\n");

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = animal2;

        Cat catLink = (Cat) animal2; // Нисходящее ЯВНОЕ преобразование

        catLink.voice();
        catLink.eat();

        System.out.println("\n === downcasting =========== \n");

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat) { // проверяем тип объекта
                System.out.println(i + "-я ссылка в массиве может быть безопасно downcasting (приведена) к Cat");
                Cat tempCat = (Cat) animals[i];
                tempCat.eat();
            }

            if (animals[i] instanceof lesson_20.animals.Hamster) {
                System.out.println(i + " может быть кастировано к хомяку");
                lesson_20.animals.Hamster hamster = (lesson_20.animals.Hamster) animals[i];
                hamster.voice("Перегруженный voice от хомяка ");
            }


            System.out.println("sout: " + animals[i]);

            animals[i].voice();
        }



        sayHello(new Cat());
        sayHello(new lesson_20.animals.Hamster());

        Object obj = new Dog();


        System.out.println("\n ====== SuperCat============= \n");

        Animal animalSuper = new lesson_20.animals.SuperCat();

        if (animalSuper instanceof Cat) {
            Cat cat = (Cat) animalSuper;
            cat.eat();
        }

        if (animalSuper instanceof lesson_20.animals.SuperCat) {
            lesson_20.animals.SuperCat superCat = (lesson_20.animals.SuperCat) animalSuper;
            superCat.eat();
            superCat.superDance();
        }


    }

    public static void sayHello(Animal animal) {
        animal.voice();
        if (animal instanceof  Cat) {
            Cat cat = (Cat) animal;
            cat.eat();
        }
    }


}