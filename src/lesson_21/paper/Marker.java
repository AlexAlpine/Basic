package lesson_21.paper;


public class Marker extends Pen{
    @Override
    public void draw(String figure) {
        System.out.println("Рисую маркером " + figure);
    }
}