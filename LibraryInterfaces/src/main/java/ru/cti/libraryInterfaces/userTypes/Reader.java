package main.java.ru.cti.libraryInterfaces.userTypes;

import main.java.ru.cti.libraryInterfaces.interfaces.IReader;

public class Reader implements IReader {
    @Override
    public void getBook() {
        System.out.println("Читатель взял книгу");
    }

    @Override
    public void returnBook() {
        System.out.println("Читатель вернул книгу");
    }
}

