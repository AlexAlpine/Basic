package lesson_21.transport;


public class Engine {

    private final long id;
    private static long counter;

    private int power;
    private final String typePower;

    private boolean isActive;

    public Engine(int power, String typePower) {
        this.power = power;
        this.typePower = typePower;
        this.id = ++counter;
    }

    public void start() {
        // Проверю запущен или нет?
        //Если нет - тогда запускаю

        if (isActive) {
            System.out.println("Двигатель " + id + " уже работает");
        } else {
            isActive = true;
            System.out.println("Двигатель " + id + " стартует");
        }
    }

    public  void stop() {
        isActive = false;
        System.out.printf("Двигатель %d заглушен\n", id);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", power=" + power +
                '}';
    }

    public long getId() {
        return id;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getTypePower() {
        return typePower;
    }
}