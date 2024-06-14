package lesson_21.transport;


public class VehicleWithEngine extends Vehicle{

    @Override
    public void startEngine() {
        if (getEngine() != null) {
            getEngine().start();
        }
    }

    @Override
    public void stopEngine() {
        if (getEngine() != null){
            getEngine().stop();
        }
    }
}