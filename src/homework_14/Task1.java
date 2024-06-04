package homework_14;

public class Task1 {
    public static void main(String[] args) {

        int workWith = 12;
        int workBefore = 13;

        Constructor_1 doctor = new Constructor_1("Alex", "Dentist", 3);
        doctor.aboutMyself();
        doctor.work();
        doctor.lunchBreak();


        Constructor_1 engineer = new Constructor_1("Max", "Design", 10);
        engineer.aboutMyself();
        engineer.work();
        engineer.lunchBreak();


        Constructor_1 teacher = new Constructor_1("Anna", "A history teacher", 20);
        teacher.aboutMyself();
        teacher.work();
        teacher.lunchBreak();


    }
}
