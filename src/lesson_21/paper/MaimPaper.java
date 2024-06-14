package lesson_21.paper;


public class MaimPaper {
    public static void main(String[] args) {

        Brush brush = new Brush();
        Pencil pencil = new Pencil();

        ColorPencil colorPencil = new ColorPencil();


        Paper paper = new Paper();

        paper.drawFigure("Квадрат", brush);
        paper.drawFigure("Овал", new Marker());
        paper.drawFigure("Квадрат", new Eraser());

        paper.drawFigure("Круг", colorPencil);

        colorPencil.setColor("Yellow");
        paper.drawFigure("Солнце", colorPencil);


    }
}