package lesson_21.transport;


public class Bicycle extends Vehicle{

    @Override
    public String toString() {
        return "Bicycle {id: " + getId() + "; Двигателя нет, только педали.";
    }

    @Override
    public void startEngine() {
        System.out.println("У велосипеда нет двигателя");
    }

    @Override
    public void stopEngine() {
        System.out.println("Перестать крутить педали?!");
    }
}