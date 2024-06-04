package homework_14;

public class Constructor_1 {


    String name;
    String profession;
    int experience;

    int workWith = 9;
    int workBefore = 18;
    int breakWith = 12;
    int breakBefore = 13;


    public Constructor_1(String name, String profession, int experience) {
        this.name = name;
        this.profession = profession;
        this.experience = experience;


    }



    void work() {

        System.out.println("I work from: " + workWith + " to " + workBefore);
    }

    void lunchBreak () {
        System.out.println("I have a break from: " + breakWith + " to " + breakBefore);

    }

    void aboutMyself() {
        System.out.println("My name " + name + " my profession " + profession + " my work experience is " + experience + " years.");
    }

}
