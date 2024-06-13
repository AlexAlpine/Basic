package lesson_19;


public class Autobus {
    /*
    Для создания связи типа HAS-A мы определяем поле класса,
    которое будет хранить ссылку на объект другого класса
     */

    /*
    Направленность связи: однонаправленные или двунаправленные
    В однонаправленной связи один класс знает о другом, но не наоборот.
    В двунаправленной оба класса знают о друг друге (имеют ссылки друг на друга)
     */

    /*
    Кардинальность - Определяет, сколько объектов одного класса может быть ассоциировано
    с объектом другого класса.

    1. One-to-One
    Один к одному: Автобус и двигатель. Каждый автобус может иметь только один двигатель
    И каждый двигатель приходится на 1 автобус


    2. One-to-Many (Many-to-One)
    Один ко многим: Автобус и пассажиры. Каждый автобус может перевозить много пассажиров.
    У автобуса будет массив пассажиров.

    3. Many-to-Many
    Многие ко многим: Список автобусов и список остановок
    Каждый автобус может останавливаться на множестве остановок (у автобуса будет массив остановок)
    Каждая остановка может обслужить множество автобусов (у остановки будет массив автобусов)
     */

    private static int counter = 1;


    private final int id;
    private BusDriver driver; // агрегация ("мягкая" связь)
    private Autopilot autopilot; // композиция (жесткая / не разрывная связь)
    private final int capacity;

    private final Passenger[] passengers;
    private int countPassenger;

    public Autobus(BusDriver driver, int capacity) {
        this.driver = driver;
        driver.setAutobus(this);
        this.capacity = capacity;
        this.autopilot = new Autopilot("AP-gpt6");
        this.id = counter++;
        this.passengers = new Passenger[capacity];
    }

    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;

        /*
        Надо проверить свободное место.
        Если есть - добавить пассажира в автобус (в массив пассажиров)
            ** Пассажир который уже в (нашем) автобусе
        Возвратить boolean - дающий отчет об успешности посадки
         */

        if (countPassenger < capacity) {
            // Место есть
            // добавляем пассажира в автобус
            if (isPassengerInBus(passenger) >= 0) {
                //Если такой пассажир уже в автобусе - прекращаем работу метода.
                System.out.printf("Пассажир %s id: %d уже в автобусе\n", passenger.getName(), passenger.getId());
                return false;
            }
            passengers[countPassenger] = passenger;
            countPassenger++;
            System.out.println("Пассажир " + passenger.getName() + " сел в автобус id: " + this.id);
            return true;
        }
        // свободного места нет
        System.out.printf("В автобусе id %d свободных мест нет\n", this.id);
        return false;

    }

    private int isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassenger; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                return i;
            }
        }
        return -1;
    }

    public boolean dropOfPassenger(Passenger passenger) {
        if (passenger == null) return false;
        /*
        Убедиться, что пассажир в автобусе
        "удалить" его из массива.
        Сдвинуть всех пассажиров "справа" от него. Не забыть изменить counter
         */

        int index = isPassengerInBus(passenger);

        if (index < 0) {
            // Пассажира нет в автобусе
            System.out.printf("Пассажир с id %d в автобусе не найден!\n", passenger.getId());
            return false;
        }

        // Можно взять ссылку на удаляемого пассажира из аргумента метода.
        Passenger tempPassenger = passengers[index];

        for (int i = index + 1; i < countPassenger; i++) {
            passengers[i - 1] = passengers[i];
        }
        // не обязательная строка
        passengers[countPassenger - 1] = null;

        countPassenger--;

        System.out.printf("Пассажир %s с id %d вышел из автобуса\n", tempPassenger.getName(), tempPassenger.getId());
        return true;
    }

    public String getPassengersList() {
        /*
        Перебрать список пассажиров
        Склеить строку из пассажиров (в едином виде id + name)
        P.S. не забыть проверять пассажиров на null
         */

        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                // добавить инфо о пассажире
                Passenger temp = passengers[i];
                sb.append("Passenger: {id: ").append(temp.getId()).append("; name: ");
                sb.append(temp.getName()).append("}").append("; ");
            }
        }

        //Если пассажиров нет - в sb будет строка: "{"
        //Отрезать два последних символа
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }

        sb.append("}");
        //Если пассажиров нет, я хочу чтоб вернулось {}
        return sb.toString();
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Autobus: {id: ");
        sb.append(id).append("; capacity:").append(capacity);
        sb.append("; driver: ").append(driver.toString());
        sb.append("; autopilot: ").append(autopilot.toString())
                .append(" }");

        return sb.toString();

//        return "Autobus: {id: " + id +  "; capacity:" + capacity +
//                "; driver: " + driver.toString() +
//                "; autopilot: " + autopilot.toString() + " }" ;
    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {
        this.driver.setAutobus(null); // старому водителя говорим, что он теперь без автобуса
        driver.setAutobus(this); // новому говорим, что он теперь в этом автобусе
        this.driver = driver; // автобусу говорим, что у него новый водитель
    }

    public int getCapacity() {
        return capacity;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public void updateAutopilotSoftware(String softVersion) {
        this.autopilot.setSoftwareVersion(softVersion);
    }
}