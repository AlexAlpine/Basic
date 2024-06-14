package homework_19;


import lesson_19.Autobus;
import lesson_19.BusDriver;
import lesson_19.Passenger;

public class PassengersApp {
    public static void main(String[] args) {

        Autobus bus = new Autobus(new BusDriver("LN-454575"), 10);

        System.out.println(bus.toString());

        System.out.println("Список пассажиров: " + bus.getPassengersList());

        Passenger passenger = new Passenger("Max");
        Passenger passenger1 = new Passenger("John");
        Passenger passenger2 = new Passenger("Mary");
        Passenger passenger3 = new Passenger("Bob");

        bus.takePassenger(passenger);
        bus.takePassenger(passenger1);
        bus.takePassenger(passenger2);

        bus.dropOfPassenger(passenger3);
        System.out.println(bus.dropOfPassenger(passenger1));

        System.out.println(bus.getCountPassenger());

        bus.takePassenger(passenger3);

        String passengersList = bus.getPassengersList();
        System.out.println("Список пассажиров: " + passengersList);

        bus.dropOfPassenger(passenger);

        System.out.println(bus.getPassengersList());

    }
}