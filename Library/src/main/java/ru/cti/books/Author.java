package main.java.ru.cti.books;

import java.util.ArrayList;

public class Author {
    String firstName;
    String lastName;
    int age;
    String country;
    ArrayList booksList = new ArrayList();

    public Author (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Author (String firstName, String lastName, int age, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
    }
}
