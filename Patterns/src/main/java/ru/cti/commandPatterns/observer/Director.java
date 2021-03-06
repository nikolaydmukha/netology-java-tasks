package main.java.ru.cti.commandPatterns.observer;

import java.util.List;

public class Director implements  IObserver{
    public void event(List<String> strings) {
        System.out.println("The list of students has changed: " + strings);
    }
}
