package lesson_27.test;


import lesson_27.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";

    @BeforeEach
    void setUp() {
       person = new Person(startEmail, startPassword);
    }

    @Test
    void testValidEmail() {
        String validEmail = "valid@test.com";
        System.out.println("getEmail before: " + person.getEmail());

        person.setEmail(validEmail);

        System.out.println("getEmail after: " + person.getEmail());
        Assertions.assertEquals(validEmail, person.getEmail());

    }

    // Если я отправляю в сеттер не валидный email.
    // стартовый email сравнить с фактическим
    // Различные варианты не валидных email
}