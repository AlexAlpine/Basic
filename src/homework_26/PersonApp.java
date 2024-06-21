package homework_26;


import lesson_26.persons.Person;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("email", "password");
        System.out.println(person);
        System.out.println(person.getPassword());

        person.setEmail("a_sd@ffff.ff");
        System.out.println(person.getEmail());

        person.setEmail("a1@email.com");
        System.out.println(person.getEmail());
        System.out.println(" ================== \n");

        person.setEmail("a1@ema@il.com");
        person.setEmail("a1@email.com.");
        person.setEmail("a1@emailcom");
        System.out.println(person.getEmail());


    }
}