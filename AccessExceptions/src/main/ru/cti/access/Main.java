package main.ru.cti.access;

import main.ru.cti.access.Exceptions.AccessDeniedException;
import main.ru.cti.access.Exceptions.UserNotFoundException;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите логин: ");
            String login = scanner.nextLine();
            System.out.println("Введите пароль: ");
            String password = scanner.nextLine();
            try {
                User user = getUserByLoginAndPassword(login, password);
                System.out.println("Найдет пользовател с логином " + user.getLogin() + ". Его почта " + user.getEmail());
                System.out.println(validateUser(user));
                break;
            }
            catch (UserNotFoundException ex) {
                System.out.println(ex.getMessage());
                continue;
            }
            catch (AccessDeniedException ex) {
                System.out.println(ex.getMessage());
                continue;
            }

        }
    }

    public static User[] getUsers() {
        User user1 = new User("Nicolas", "n1c0l@$","nicolas@gmail.com",  35);
        User user2 = new User("Julia", "jul1@@$","julia@gmail.com",  30);
        User user3 = new User("default", "default","default@gmail.com",  15);
        return new User[]{user1, user2, user3};
    }
    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPass().equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static String validateUser(User user) throws AccessDeniedException {
        if (user.getAge() <= 18) {
            throw  new AccessDeniedException("User is under 18th years");
        }
        return "User is up the 18th years";
    }
}
