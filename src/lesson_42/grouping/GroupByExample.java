package lesson_42.grouping;


import java.util.*;
import java.util.stream.Collectors;

public class GroupByExample {
    /*
    Collectors.groupingBy(Function classifier) - простейшая форма группировки.
    Группирует элементы потока по ключу, полученному с помощью функции-классификатора.
    Результатом будет Map<K, List<T>

     */
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
    }

    private static void task3() {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Petr", 2500, 25, "developer", "IT"),
                new Employee("Silvia", 1500, 22, "trainee", "IT"),
                new Employee("Stefan", 2500, 30, "PM", "IT"),
                new Employee("Olivia", 2700, 25, "manager", "Management"),
                new Employee("Sebastian", 3500, 28, "chef", "Management"),
                new Employee("Hanna", 2000, 25, "chef", "Cleaning"),
                new Employee("Petr", 1300, 45, "Cleaner", "Cleaning"),
                new Employee("John", 3200, 19, "chef", "IT")
        ));

        //Сгруппировать сотрудников по отделам
        Map<String, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(map);

        Map<String, Set<Employee>> map1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, LinkedHashMap::new, Collectors.toSet()));
        System.out.println("Employee::getDepartment, Collectors.toSet()): " + map1);

        System.out.println();
        // количество сотрудников по отделам
        Map<String, Long> map2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println("Employee::getDepartment, Collectors.counting()): " + map2);

        // Расчет средней зарплаты по отделу
        Map<String, Double> map3 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Average: " + map3);

        // Группировка сотрудников по отделу, при этом я хочу получить список зарплат
        Map<String, List<Integer>> map4 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getSalary, Collectors.toList())));

        System.out.println("Список зарплат по отделу: " + map4);


        System.out.println("=====================");
        // Суммарная статистика

//        DoubleSummaryStatistics statistics = employees.stream()
//                .collect(Collectors.summarizingDouble(Employee::getSalary));

        IntSummaryStatistics statistics = employees.stream()
                .collect(Collectors.summarizingInt(Employee::getSalary));

        System.out.println("max: " + statistics.getMax());
        System.out.println("min: " + statistics.getMin());
        System.out.println("avg: " + statistics.getAverage());
        System.out.println("count: " + statistics.getCount());
        System.out.println("sum: " + statistics.getSum());
        System.out.println("statistics: " + statistics);




    }

    private static void task2() {
        List<Integer> integers = List.of(1, 2, 3, -10, 105, 4, 5, -21, 6, 7, 0, 200, 140, 350);

        Map<String, List<Integer>> map = integers.stream()
                .collect(Collectors.groupingBy(i -> {
                    if (i == 0) return "Zero";
                    if (i > 100) return "GreatNumbers";
                    if (i < 0) return "Negative";
                    if (i % 2 == 0) {
                        return "Even";
                    } else {
                        return "Odd";
                    }
                }));

        System.out.println(map);

        List<Integer> greatNumbers = map.get("GreatNumbers");
        System.out.println(greatNumbers);
    }

    private static void task1() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 5, 6, 7);

        Map<String, List<Integer>> map = integers.stream()
                .collect(Collectors.groupingBy(i -> (i % 2 == 0) ? "Even" : "Odd"));

        System.out.println(map);


    }
}