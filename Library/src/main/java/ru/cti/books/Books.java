package main.java.ru.cti.books;


public class Books {
    String title;
    Author author;
    int pages;
    int year;

    public static int totalBooks;

    public String toString() {
        return "Книга \"" + title +  "\" издана в " + year + " году. Автор книги " + author.lastName + "\n";
    }

    public String pagesCompare (Books a) {
        String result = String.format("Книга \"%s\" содержит больше страниц, чем книга \"%s\"", this.title, a.title);
        if (a.pages > this.pages)
            result = String.format("Книга \"%s\" соержит больше страница, чем книга \"%s\"", a.title, this.title);
        else if (a.pages == this.pages)
            result = String.format("Книги \"%s\" и \"%s\" одинаковы.", a.title, this.title);
        return result;
    }
}
