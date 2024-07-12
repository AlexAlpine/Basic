package homework_40;

/*
Дан список Person с полями name, age, city.

Используйте Stream API для фильтрации людей,
которые старше определенного возраста и проживают в определенном городе,
а затем соберите их в список.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(List.of(
                new Person("Person1", 21, "Berlin"),
                new Person("Person2", 28, "Paris"),
                new Person("Person3", 25, "London"),
                new Person("Person4", 32, "Berlin")
        ));

        List<Person> personList = people.stream()
                .filter(p -> p.getAge() > 25)
                .filter(p -> p.getCity().equals("Berlin"))
                .collect(Collectors.toList());

        System.out.println(personList);



    }




    static class  Person {
        private String name;
        private int age;
        private String city;

        public Person(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", city='" + city + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }
}