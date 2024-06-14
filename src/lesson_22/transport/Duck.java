package lesson_22.transport;


public class Duck implements Flyable, Swimable {

    private String color;

    public Duck(String color) {
        this.color = color;
    }

    @Override
    public void fly() {
        System.out.println("Уточка " + color + " летит на юг");
    }

    @Override
    public void swim() {
        System.out.println(color + " утка плывет по озеру");
    }

    public String getColor() {
        return color;
    }
}
