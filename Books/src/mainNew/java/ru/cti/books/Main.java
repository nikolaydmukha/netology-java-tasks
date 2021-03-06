package mainNew.java.ru.cti.books;

public class Main {
    public static void main(String[] args) {
        Books book = new Books();
        book.title = "Война и мир";
        book.author = "Л.Н.Толстой";
        book.year = 1800;

        book.toString();
    }
}
