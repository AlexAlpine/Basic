package lesson_21.transport;


public class Car extends VehicleWithEngine {


    public Car(Engine engine) {
        super();
        this.setEngine(engine);
    }



    @Override
    public String toString() {
        // Todo А если двигатель null?
        return "Car {id: " + getId() + "; engine: " + getEngine() + "}";
    }


}