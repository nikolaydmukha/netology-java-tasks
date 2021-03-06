package main.java.ru.cti.libraryInterfaces.userTypes;

import main.java.ru.cti.libraryInterfaces.interfaces.IAdministrator;

public class Administrator implements IAdministrator {
    @Override
    public void manage() {
        System.out.println("Админ составил график работы");
    }
}
