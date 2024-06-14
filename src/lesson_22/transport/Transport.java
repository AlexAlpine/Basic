package lesson_22.transport;


public abstract class Transport {

    protected int capacity;

    public Transport(int capacity) {
        this.capacity = capacity;
    }

    abstract void takePassenger();

    public int getCapacity() {
        return capacity;
    }
}
