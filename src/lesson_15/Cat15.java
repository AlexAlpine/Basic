package lesson_15;


import lesson_14.Cat;

public class Cat15 {
    private String name;
    private int age;
    private int weight;

    public Cat15 (String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void sayMeow() {
        System.out.println("Мяу! " + name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return  this.weight;
    }

    public void setAge (int age) {
        if (age < 0 || age > 20) return;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        if (weight < 0 ) return;
        this.weight = weight;

    }
}