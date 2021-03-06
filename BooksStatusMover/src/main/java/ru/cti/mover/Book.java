package main.java.ru.cti.mover;

public class Book {
    public String title;
    public String author;
    public Statuses.Status bookStatus;


    public Book (String title){
        this.title = title;
        this.bookStatus = Statuses.Status.AVAILABLE;
    }

    public void getBookStatus(){
        System.out.println("Статус книги " + this.bookStatus);
    }

    public void setBookStatus(Statuses.Status status) {
        this.bookStatus = status;
    }
}
