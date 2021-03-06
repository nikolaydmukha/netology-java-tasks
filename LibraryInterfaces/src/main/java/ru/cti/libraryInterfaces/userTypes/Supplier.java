package main.java.ru.cti.libraryInterfaces.userTypes;

import main.java.ru.cti.libraryInterfaces.interfaces.IReader;
import main.java.ru.cti.libraryInterfaces.interfaces.ISupplier;

public class Supplier implements ISupplier, IReader {
    @Override
    public void supplyBook() {
        System.out.println("Поставил партию книг");
    }

    @Override
    public void returnBook() {
        System.out.println("Поставщик вернул книгу");
    }

    @Override
    public void getBook() {
        System.out.println("Поставщик взял книгу почитать");
    }
}
