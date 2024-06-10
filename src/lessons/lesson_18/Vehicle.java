package lessons.lesson_18;


public class Vehicle {
    private String model;
    private int yearOfManufacture;

    public Vehicle(String model, int yearOfManufacture) {
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String toString() {
        return model + " г.в.: " + yearOfManufacture;
    }

    public void start() {
        System.out.println(model + " начинает движение");
    }

    public void stop() {
        System.out.println(model + " останавливается");
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
}
