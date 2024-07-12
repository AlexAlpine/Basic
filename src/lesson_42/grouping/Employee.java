package lesson_42.grouping;


import java.util.Objects;

public class Employee {
    private String name;
    private  int salary;
    private  int age;
    private String position;
    private String department;

    public Employee(String name, int salary, int age, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.position = position;
        this.department = department;
    }

    @Override
    public String toString() {
        return "{" +
                name +
                " : " + salary +
                " : " + position +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;
        return salary == employee.salary && age == employee.age && Objects.equals(name, employee.name) && Objects.equals(position, employee.position) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + salary;
        result = 31 * result + age;
        result = 31 * result + Objects.hashCode(position);
        result = 31 * result + Objects.hashCode(department);
        return result;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}