package lesson_26.persons;


public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("email", "password");

        System.out.println(person);
        System.out.println(person.getPassword());

    }
}