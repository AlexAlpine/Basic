package lesson_18;


public class HW_18 {
    public static void main(String[] args) {
        IntercityBus iBus = new IntercityBus("Man-01", 2020, 5, 2);

        System.out.println(iBus.toString());

        iBus.takePassenger();
        iBus.takePassenger();
        iBus.takePassengerWithBicycle();
        iBus.takePassengerWithBicycle();

        System.out.println("\n=====================\n");
        System.out.println("Пассажиров: " + iBus.getCountPassengers());
        System.out.println("Велосипедов: " + iBus.getCountBicycle());


        System.out.println(iBus.dropOffPassengerWithBicycle());
        System.out.println(iBus.dropOffPassengerWithBicycle());
        System.out.println(iBus.dropOffPassengerWithBicycle());


    }
}