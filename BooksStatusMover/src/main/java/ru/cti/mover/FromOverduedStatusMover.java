package main.java.ru.cti.mover;

public class FromOverduedStatusMover extends  BookMover{
    @Override
    protected void moveToStatus(Book book, Statuses.Status requestedStatus) {
        boolean possible = false;
        switch (requestedStatus) {
            case OVERDUED:
            case BORROWED:
                possible = false;
                break;
            case AVAILABLE:
            case ARCHIVED:
                possible = true;
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
