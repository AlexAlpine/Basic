package lesson_21.paper;


public class Eraser extends Pen{
    @Override
    public void draw(String figure) {
        System.out.println("Стираю " + figure);
    }
}