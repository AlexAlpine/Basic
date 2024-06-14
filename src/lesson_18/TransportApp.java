package lesson_18;


public class TransportApp {
    public static void main(String[] args) {

        Bus bus = new Bus("Bus-X1", 2020, 3);

        System.out.println(bus.toString());
        bus.start();
        bus.stop();

        System.out.println("capacity: " + bus.getCapacity());
        System.out.println(bus.getModel() + " | " + bus.getYearOfManufacture());

        bus.setModel("MAN");
        System.out.println(bus.toString());

        Train train = new Train("Skoda", 2022, 5);

        System.out.println(train.toString());

        System.out.println(train.getCapacity());

        System.out.println("\n==========================\n");

        System.out.println(bus.takePassenger());
        System.out.println(bus.takePassenger());
        System.out.println(bus.takePassenger());
        System.out.println(bus.takePassenger());

        System.out.println("bus.getCountPassengers(): " + bus.getCountPassengers());

        System.out.println(bus.dropOffPassenger());
        System.out.println(bus.dropOffPassenger());
        System.out.println(bus.dropOffPassenger());
        System.out.println(bus.dropOffPassenger());

        System.out.println("bus.getCountPassengers(): " + bus.getCountPassengers());

        System.out.println("\n ========================== \n");

        IntercityBus intercityBus = new IntercityBus("Volvo", 2015, 3, 2);

        intercityBus.start();
        System.out.println(intercityBus.toString());
        System.out.println(intercityBus.dropOffPassenger());


        System.out.println("\n========================\n");
        System.out.println(intercityBus.getCountPassengers());

        intercityBus.takePassenger();
        intercityBus.takePassenger();


        System.out.println(intercityBus.takePassengerWithBicycle());
        intercityBus.takePassengerWithBicycle();
        intercityBus.takePassenger();

        intercityBus.dropOffPassenger();

        System.out.println(intercityBus.getCountPassengers() + " | " + intercityBus.getCapacity());
        System.out.println(intercityBus.getCountBicycle() + " | " + intercityBus.getPlaceBicycle());

        intercityBus.takePassengerWithBicycle();

        System.out.println(intercityBus.getCountPassengers() + " | " + intercityBus.getCapacity());
        System.out.println(intercityBus.getCountBicycle() + " | " + intercityBus.getPlaceBicycle());





    }
}