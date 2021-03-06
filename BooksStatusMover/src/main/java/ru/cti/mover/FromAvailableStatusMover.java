package main.java.ru.cti.mover;

public class FromAvailableStatusMover extends  BookMover {
    @Override
    protected void moveToStatus(Book book, Statuses.Status requestedStatus) {
        boolean possible = false;
        switch (requestedStatus) {
            case OVERDUED:
            case ARCHIVED:
            case BORROWED:
                possible = true;
                break;
            case AVAILABLE:
                possible = false;
                break;
        }
        if (possible == true) {
            super.moveToStatus(book, requestedStatus);
        }
        else {
            System.out.println("Нельзя перенвести книгу из статуса " + book.bookStatus + " в статус " + requestedStatus);
        }
    }
}
