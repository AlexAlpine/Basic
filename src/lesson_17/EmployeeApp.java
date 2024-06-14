package lesson_17;


import java.util.Arrays;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee peter = new Employee("Peter", 1500);
        Employee employee1 = new Employee("Max", 5000);
        Employee employee2 = new Employee("Anna", 2500);
        Employee employee3 = new Employee("John", 5000);
        Employee employee4 = new Employee("Mary", 5000);

//        System.out.println(employee.toString());
//        System.out.println(employee1.toString());
//
//        System.out.println(employee4.toString());

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Peter", 1500);
        employees[4] = employee3;

        System.out.println(employees[0].getId());

        System.out.println(employees[0].toString());

        employees[1] = employees[0];
        employees[0] = null;

        Employee empl1 = employees[1];

        empl1.setSalary(2500);

        System.out.println(empl1.toString());
        System.out.println(employees[1].toString());

        System.out.println(Employee.PI);

//
        System.out.println(Arrays.toString(employees));

//        int indexMaxSalary = getEmployeeMaxSalary(employees);
        int indexMaxSalary = getEmployeeMaxSalary(new Employee[3]);

        if (indexMaxSalary != -1) {
            System.out.println("indexMaxSalary: " + indexMaxSalary);
            System.out.println(employees[indexMaxSalary]);
        } else {
            System.out.println("Что-то пошло не так. Сотрудник не найден");
        }

    }

    public static int getEmployeeMaxSalary(Employee[] employees) {

        if (employees == null) return -1;
        int index = indexNotNullEmployee(employees);
        if (index == -1) return -1;
//        System.out.println("Найден не null сотрудник: " + employees[index]);
        int maxSalary = employees[index].getSalary();

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                index = i;
            }
        }
        return index;
    }

    private static int indexNotNullEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) return i;
        }
        return -1;
    }

}