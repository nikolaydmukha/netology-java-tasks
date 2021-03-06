package main.java.ru.cti.mover;

public class BookMover {
    protected void moveToStatus(Book book, Statuses.Status requestedStatus) {
        System.out.println("Меняем статус книги " + book.title + " с " + book.bookStatus + " на " + requestedStatus);
        book.bookStatus = requestedStatus;

    }
}
