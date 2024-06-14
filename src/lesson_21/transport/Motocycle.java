package lesson_21.transport;


public class Motocycle extends VehicleWithEngine {

    public Motocycle(Engine engine){
        super();
        setEngine(engine);
    }

    @Override
    public String toString() {
        return "Motocycle {id:" + getId() + ";engine " + getEngine() + "}";
    }


}