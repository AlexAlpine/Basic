package lesson_22.transport;


public class Airplane extends Transport implements Flyable {

    public Airplane(int capacity) {
        super(capacity);
    }

    @Override
    public void fly() {
        System.out.println("Самолет летит по небу");
    }

    @Override
    void takePassenger() {
        System.out.println("Самолет берет на борт пассажира");
    }
}
