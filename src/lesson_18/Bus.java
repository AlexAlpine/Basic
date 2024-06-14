package lesson_18;


public class Bus extends Vehicle{
    private int capacity;
    private int countPassengers;

    public Bus(String model, int year, int capacity) {
        // Чтобы создать объект родителя нам нужно вызвать его конструктор
        super(model, year);// вызываем конструктор родительского класс
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public boolean takePassenger() {
        // Проверить есть свободное место
        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Пассажир зашел в автобус: " + this.getModel());
            return true;
        } else {
            System.out.println(this.getModel() + " полный. Мест нет.");
            return false;
        }
    }

    public boolean dropOffPassenger() {
        // Проверить, есть ли в автобусе пассажиры
        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Пассажир вышел из автобуса " + this.getModel());
            return true;
        }

        System.out.printf("В автобусе %s больше нет пассажиров\n", this.getModel());
        return false;
    }


}