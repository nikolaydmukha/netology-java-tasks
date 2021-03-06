package main.java.ru.cti.libraryInterfaces;


import main.java.ru.cti.libraryInterfaces.userTypes.Administrator;
import main.java.ru.cti.libraryInterfaces.userTypes.Librarian;
import main.java.ru.cti.libraryInterfaces.userTypes.Reader;
import main.java.ru.cti.libraryInterfaces.userTypes.Supplier;

public class Main {
    public static void main(String[] args) {

        Administrator adm = new Administrator();
        Reader reader = new Reader();
        Librarian librarian = new Librarian();
        Supplier supplier = new Supplier();

        adm.manage();
        librarian.giveBook();
        reader.getBook();
        supplier.supplyBook();

        }
    }
