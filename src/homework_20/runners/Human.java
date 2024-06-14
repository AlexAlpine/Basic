package homework_20.runners;


/*
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи

У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;

Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5

В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
 */

public class Human {

    private final int runSpeed;
    private final int restTime;

    private String typeRunner = "Человек";

    public Human() {
        this.runSpeed = 10;
        this.restTime = 15;
    }

    public Human(int runSpeed, int restTime) {
        this.runSpeed = runSpeed;
        this.restTime = restTime;
    }

    public void run() {
        System.out.println(typeRunner + " бежит со скоростью " + runSpeed);
        rest();
    }

    public void rest() {
        System.out.println(typeRunner + " нужно для отдыха " + restTime);
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public int getRestTime() {
        return restTime;
    }

    public String getTypeRunner() {
        return typeRunner;
    }

    public void setTypeRunner(String typeRunner) {
        this.typeRunner = typeRunner;
    }

    // Alt + Insert


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // сравнили ссылки
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Human human = (Human) obj; // кастинг от класса Object к классу Human
        return this.runSpeed == human.runSpeed && this.restTime == human.restTime;
    }


    @Override
    public String toString() {
        return "{" +
                "runSpeed=" + runSpeed +
                ", restTime=" + restTime +
                ", typeRunner='" + typeRunner + '\'' +
                '}';
    }
}