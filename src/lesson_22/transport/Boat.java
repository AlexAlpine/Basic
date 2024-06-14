package lesson_22.transport;


public class Boat extends Transport implements Swimable {

    public Boat(int capacity) {
        super(capacity);
    }

    @Override
    public void swim() {
        System.out.println("Корабль плывет по морю");
    }

    @Override
    void takePassenger() {
        System.out.println("Корабль берет на борт пассажира");
    }
}
