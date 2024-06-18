package homework_24;

public class SeasonsApp {
    public static void main(String[] args) {

        Season winter = Season.WINTER;

        String winterStr = Season.WINTER.toString();
        System.out.println("Winter: " + winterStr);

        Season spring = Season.SPRING;
        String springStr = Season.SPRING.toString();
        System.out.println("Spring: " + springStr);

        Season summer = Season.SUMMER;
        String summerStr = Season.SUMMER.toString();
        System.out.println("Summer: " + summerStr);

        Season autumn = Season.AUTUMN;
        String autumnStr = Season.AUTUMN.toString();
        System.out.println("Autumn: " + autumnStr);


    }
}
