package lesson_21.transport;


/*
Создайте иерархию классов для разных типов транспортных средств:
Vehicle (родительский класс),
Car, Bicycle и Motorcycle (дочерние классы).

Родительский класс Vehicle должен иметь метод startEngine(), который не будет иметь реализации.

Дочерние классы Car, Bicycle и Motorcycle должны переопределить метод startEngine() для запуска соответствующего типа двигателя (если есть).

Создайте массив транспортных средств разных типов.
Используйте полиморфизм для вызова метода startEngine() для каждого транспортного средства.
 */

public abstract class Vehicle {

    private final int id;
    private static  int counterId;

    private Engine engine;

    public Vehicle() {
        this.id = ++counterId;
    }

    // Абстрактный метод. Без реализации
    public abstract void startEngine();

    public abstract void stopEngine();

    public int getId() {
        return id;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", engine=" + engine +
                '}';
    }
}