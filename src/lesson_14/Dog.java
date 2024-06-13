package lesson_14;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight){
        this.name = name;
        this.weight = weight;
    }


    void eat() {
        System.out.println("я кушаю");
        weight++;

    }

    void  run() {
        while (weight < 3) {
            System.out.println("бежать не могу ");
            System.out.println("нужно поесть " + weight);
        eat();
        }

        System.out.println("Я бегу!");
        weight -= 2;
    }

    void printInfo() {
        System.out.println("I am dog " + this.name + ", my weight: " + weight);
    }

}
