package main.java.ru.cti.parentsPatterns.builder;

public class Person {

    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    //Constructor
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }
    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }
    //Methods
    public boolean hasAge(Person person){
        if (person.age == 0)
            return false;
        return true;
    }
    public boolean hasAddress(Person person){
        if (person.address ==null)
            return false;
        return true;
    }
    //Getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() { return address; }

    //Setters
    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return String.format("Имя: %s Фамилия: %s Возраст: %s Адрес: %s", this.name, this.surname,
                this.age == 0 ? "Не указан" : this.age, this.address == null ? "Не указан" : this.address);
    }
}
