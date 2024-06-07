package lessons.lesson_15;

import lessons.lesson_14.Cat;

public class Cat15 {
   private String name;
    private int age;
    private int weight;

    public Cat15(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
     void sayMeow() {
         System.out.println("Meow");
     }
     public String getName() {
        return name;
     }
     public int getAge() {
        return  this.age;
     }
     public int getWeight() {
        return this.weight;

     }

    public void setAge(int age) {
        if (age < 0 || age > 20) return;;

    }
}
