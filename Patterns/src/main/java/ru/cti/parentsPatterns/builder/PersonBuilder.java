package main.java.ru.cti.parentsPatterns.builder;

public class PersonBuilder implements IPersonBuilder{
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalStateException{
        if (age <= 0)
            throw new IllegalStateException();
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public Person build() throws IllegalStateException{
        if (this.age == 0 && this.address == null)
            return new Person(this.name, this.surname);
        else if (this.age == 0 && this.address != null)
            return new Person(this.name, this.surname, this.address);
        else if (this.age != 0 && this.address == null)
            return new Person(this.name, this.surname, this.address);
        return new Person(this.name, this.surname,this.age,this.address);
    }
}
