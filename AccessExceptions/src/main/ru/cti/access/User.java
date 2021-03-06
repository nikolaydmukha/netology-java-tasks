package main.ru.cti.access;

public class User {

    String login;
    String password;
    String email;
    int age;
    public User (String login, String password, String email, int age) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public String getLogin() {
        return this.login;
    }
    public String getPass() {
        return this.password;
    }
    public int getAge() {
        return this.age;
    }
    public String getEmail() {
        return this.email;
    }
}
