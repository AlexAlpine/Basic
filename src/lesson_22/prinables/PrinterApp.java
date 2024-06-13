package lesson_22.prinables;

public class PrinterApp {
    public static void main(String[] args) {

    Printable book = new Book("Философия Java", "Б.Эккель");
    book.print();

    Printable journal = new Journal("Cosmopolitan", 154);

    Book book1 = new Book("мастер и Маргарита", "М.Булгаков");

    book.test();
    journal.test();

    Printable.testStatik("Hello");

    }


}
