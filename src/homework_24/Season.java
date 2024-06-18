package homework_24;

public enum Season {

    WINTER(1),
    SPRING (15),
    SUMMER(25),
    AUTUMN(16);

    private final double averageTemperature;

    Season(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    @Override
    public String toString() {
        return "Season{" +
                "averageTemperature = " + averageTemperature +
                '}';
    }
}
