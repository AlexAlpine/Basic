package lesson_27.test;

import lesson_27.TestEnum;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    // Метод, помеченный этой аннотацией выполняется перед КАЖДЫМ тестом (перед каждым тестовым методом)
    @BeforeEach
    public void setUp() {
        System.out.println("Method @BeforeEach");
    }
    /*
    @BeforeAll - метод будет запускать только один раз перед выполнением первого теста
    @AfterEach - выполняется после каждого тестового метода
    @AfterAll - выполняется один раз после всех тестовых методов
    @Disabled - указывает, что тест или группа тестов отключен и выполняться не будут
    @Nested - позволяет создавать вложенный тестовый класс. Может быть использована для группировки тестовых методов
     */


    @Test
    public void testAddition() {
        int result = 2 + 2;

        Integer[] array = {1, 2, 3, null, 5};

        Assertions.assertEquals(4, result); // проверяет равны ли два значения
        Assertions.assertNotEquals(5, result); // тест будет пройден если "неожидаемый результат" не совпадет с фактическим
        assertTrue(result >= 4); // проверяет, что условие верно (условие возвращает true)
        assertFalse(result > 5); // проверяет, что условие ложно (условие возвращает false)
        assertNotNull("String"); // проверяет, что объект не равен null
        assertNull(array[3]); // проверяет, что объект равен null

    }

    @Disabled // указывает, что тест или группа тестов отключен и выполняться не будут
    @Test
    public void emptyTest() {
        assertEquals(5, 10);
    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "cherry", "fig"})
    public void testFruits(String fruit) {
        System.out.println("Current fruit: " + fruit);
        Assertions.assertTrue(fruit.length() > 2);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, -1, 4, 5})
    void testInts(int value) {
        System.out.println("current int: " + value);
        Assertions.assertTrue(value > -10);
    }

    @ParameterizedTest
    @EnumSource(TestEnum.class)
        // В качестве источника будет набор констант из перечисления
    void testEnum(TestEnum value) {
        System.out.println("Enum: " + value);
        assertNotNull(value);
    }

    //Источник данных в формате CSV
    @ParameterizedTest
    @CsvSource({"apple, 1", "banana, 2", "cherry, 3"})
    void testWithCsvSource(String fruit, int rank) {
        System.out.println("fruit: " + fruit);
        System.out.println("rank: " + rank);
        Assertions.assertNotNull(fruit);
        assertTrue(rank > 0);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")
    void testWithFileSource(String fruit, int rank, boolean flag) {
        System.out.println(fruit + " | " + (rank + 10) + " | " + !flag);
        assertTrue(fruit.length() > 4 && rank > 0);
    }

    @ParameterizedTest
    @MethodSource("testMethodSource")
    void testDataFromMethod(String fruit) {
        System.out.println("fruit: " + fruit);
        assertNotNull(fruit);
    }

    static Stream<String> testMethodSource() {
        return Stream.of("banana", "cherry", "orange");
    }

    @ParameterizedTest
    @MethodSource("squareTestData")
    void testSquare(int input, int expected, boolean isEqual) {
        System.out.println(input + " | " + expected + " | " + isEqual);
        int result = input * input;
        assertEquals(isEqual, result == expected);
    }

    static Stream<Arguments> squareTestData() {
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)
        );
    }


    @Disabled
    @Nested
    class NestedTest {

        @BeforeEach
        public void setStartValues() {
            System.out.println("Nested Before Each");
        }

        @Test
        void testNested() {
            Assertions.assertNotEquals(5, 10);
        }

        @Test
        void testNested2() {
            assertNotNull("Java");
        }
    }

}