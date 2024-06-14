package lesson_17;


public class Employee {

    private static long counterId = 100;
    public static double PI = 3.141519;

    private final long id; // Уникальный идентификатор объекта
    private String name;
    private  int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;

        this.id = counterId;
        counterId++;
    }

    public String toString() {
        return "{id: " + id + " | " + name+ ", salary: " + salary + "}";
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}