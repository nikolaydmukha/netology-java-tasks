package main.java.ru.cti.books;

import java.util.ArrayList;

public class User {
    String firstName;
    String lastName;
    String email;
    String address;
    ArrayList booksList = new ArrayList();

    static int totalUsers;

    public User (String firstName, String lastName, String  email, String  address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        totalUsers++;
    }

    public String toString() {
        String currentBooks = "\n";
        for (int i = 0; i < booksList.size(); i++)
        {
            currentBooks += booksList.get(i);
        }
        return String.format("Читатель: %s\nEmail: %s\nАдрес: %s\nСписок книг: %s", firstName + " " + lastName,
                email, address, currentBooks);
    }
}
