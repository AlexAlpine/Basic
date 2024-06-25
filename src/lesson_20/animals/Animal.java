package lesson_20.animals;


public class Animal {


    public void voice() {
        System.out.println("Animal say something");
    }

    @Override
    public String toString() {
        return "Animal toStr";
    }
}