package lesson_24.enums;

public class EnumExample {
    public static void main(String[] args) {

    Day today = Day.MONDAY;
        System.out.println(today);

        switch (today) {
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case MONDAY:
                System.out.println("Понедельник");
                break;
            default:
                System.out.println("Какой-то другой день");

        }

        Day[] values = Day.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);

        }
        System.out.println("\n=========================\n");
        String dayStr = Day.MONDAY.name();
        System.out.println(dayStr);

        Day someDay = Day.valueOf("Monday".toUpperCase());
        System.out.println(someDay);

        System.out.println(someDay == Day.MONDAY);

        System.out.println(Day.THURSDAY.ordinal());

        Planet mercury = Planet.MERCURY;
        System.out.println(mercury);

        System.out.println(mercury.getMass());
        System.out.println(mercury.getRadius());

        String mercuryStr = Planet.MERCURY.toString();
        System.out.println("mercuryStr: " + mercuryStr);

        mercuryStr = Planet.MERCURY.name();
        System.out.println("Planeta.MERCURY.name" + Planet.MERCURY.name());

    }

}
