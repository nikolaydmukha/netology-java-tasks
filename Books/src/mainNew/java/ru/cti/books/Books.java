package mainNew.java.ru.cti.books;

public class Books {
    String title;
    String author;
    String pages;
    int year;

    public String toString() {
       String f = null;
       return  f.format("Книга \"%s\" издана в %s. Автор книги %s.", title, year, author);
    }

}
