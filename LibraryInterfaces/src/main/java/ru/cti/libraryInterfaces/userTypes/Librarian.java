package main.java.ru.cti.libraryInterfaces.userTypes;

import main.java.ru.cti.libraryInterfaces.interfaces.ILibrarian;

public class Librarian implements ILibrarian {
    @Override
    public void giveBook() {
        System.out.println("Библиотекарь выдал книгу");
    }

    @Override
    public void orderBook() {
        System.out.println("Библиотекарь заказал новую партию книг");
    }
}
