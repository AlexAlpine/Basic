package lesson_21.transport;


public class TransportApp {
    public static void main(String[] args) {

        Car car = new Car(new Engine(200, "Petrol"));

        System.out.println(car);

        car.startEngine();
        car.stopEngine();

        car.startEngine();

        Motocycle moto = new Motocycle(new Engine(150, "E-Power"));

        System.out.println(moto);
        moto.stopEngine();
        moto.startEngine();
        moto.startEngine();

        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle);
        bicycle.startEngine();
        bicycle.stopEngine();

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = bicycle;
        vehicles[2] = moto;

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].startEngine();
        }


    }
}