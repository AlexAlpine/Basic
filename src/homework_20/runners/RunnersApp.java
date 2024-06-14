package homework_20.runners;


public class RunnersApp {
    public static void main(String[] args) {
        Human human = new Human();
        AmateurRunner amateur = new AmateurRunner();
        ProfiRunner profi = new ProfiRunner();

        human.run();

        amateur.run();

        profi.run();

        Human human1 = new Human(10, 15);

        System.out.println(human);
        System.out.println(human1);

        AmateurRunner amateur1 = new AmateurRunner(10, 15);
        AmateurRunner amateur2 = new AmateurRunner(10, 15);

        System.out.println("сравниваем ссылки: " + (human == human1)); //сравниваем ссылки
        System.out.println("хочу сравнить объекты: " + human.equals(human1));

        System.out.println("amateur1.equals(amateur2): " + amateur1.equals(amateur2));

        System.out.println(human.equals(amateur1));





    }
}