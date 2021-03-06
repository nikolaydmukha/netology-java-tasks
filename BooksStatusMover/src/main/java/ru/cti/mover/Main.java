package main.java.ru.cti.mover;


public class Main {
    public static void main(String[] args) {
        Statuses status = new Statuses();

        Book firstBook = new Book("А зори здесь тихие...");
        Book secondBook = new Book("4 танкиста и собака");
        Book thirdBook = new Book("Ночной дозор");
        Book fourthBook = new Book("Мастер и марграрита");

        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        BookMover fromArchievedStatusMover = new FromArchievedStatusMover();
        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        BookMover fromOverduedStatusMover = new FromOverduedStatusMover();

        firstBook.getBookStatus();
        firstBook.setBookStatus(Statuses.Status.OVERDUED);
        secondBook.setBookStatus(Statuses.Status.ARCHIVED);
        thirdBook.setBookStatus(Statuses.Status.BORROWED);
        fourthBook.setBookStatus(Statuses.Status.OVERDUED);
//        firstBook.getBookStatus();
        fromAvailableStatusMover.moveToStatus(firstBook, Statuses.Status.BORROWED);
        fromArchievedStatusMover.moveToStatus(secondBook, Statuses.Status.ARCHIVED);
        fromBorrowedStatusMover.moveToStatus(thirdBook, Statuses.Status.BORROWED);
        fromOverduedStatusMover.moveToStatus(fourthBook, Statuses.Status.AVAILABLE);
    }
}
