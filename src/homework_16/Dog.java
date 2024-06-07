package homework_16;


/*
Написать класс Собака (Dog).

Каждая Собака обязательно должна иметь имя и высоту прыжка ++

Должна уметь прыгать и должна уметь тренироваться. +-

За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров ++

Максимальная высота прыжка, которую может натренировать собака, не может быть больше,
чем двукратная высота первоначального прыжка.

Также должен быть метод взять барьер. В параметрах метод принимает высоту барьера.
Если собака в состоянии преодолеть этот барьер - прыгает.

Если не в состоянии, нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).
Если да -> идем тренироваться -> берет барьер

Добавить в класс константу. Использовать эту константу в классе. ++

Добавить в класс поле, в котором будет храниться количество прыжков, сделанных всеми объектами класса.
 */
public class Dog {

    private String name;
    private int jumpHeight;
    private final int maxJump;

    private static final int INCREASE_PER_TRAINING = 10;
    private static final int MAX_JUMP_MULTIPLIER = 2;

    private static int totalJumpCounter;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        maxJump = jumpHeight * MAX_JUMP_MULTIPLIER;
    }

    public void getBarrier(int barrier) {
        if (jumpHeight >= barrier) {
            jump();
            return;
        }

        if (maxJump >= barrier) {
            //может взять
            //надо тренировать
            System.out.println(name + " идет тренироваться");

            while (jumpHeight < barrier) {
                train();
            }
            jump();

            System.out.printf("Собака %s перепрыгивает барьер %d. Текущий прыжок %d\n", name, barrier, jumpHeight);
        } else {
            System.out.printf("Барьер высотой %d собака %s взять не может. Текущий прыжок %d\n", barrier, name, jumpHeight);
        }

    }

    public void train() {

        if (jumpHeight < maxJump) {
            jumpHeight += INCREASE_PER_TRAINING;
        }

        if (jumpHeight > maxJump) {
            jumpHeight = maxJump;
        }


//        if (jumpHeight + INCREASE_PER_TRAINING > maxJump) {
//            System.out.println(jumpHeight + " | " + maxJump);
////            System.out.println("Тренироваться запрещено");
//        } else {
//            System.out.println("Training");
//            jumpHeight += INCREASE_PER_TRAINING; // Увеличиваем на 10 за одну тренировку
//        }
    }

    public void jump() {

        System.out.println(name + " Прыгнула!");
        totalJumpCounter++;
    }

    public int getTotalJumps() {
        return Dog.totalJumpCounter;
    }

    public String toString() {
        return "{Dog " + name + "; current jump: " + jumpHeight + "}";
    }

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setName(String name) {
        this.name = name;
    }
}
