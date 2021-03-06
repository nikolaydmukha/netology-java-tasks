package main.java.ru.cti.commandPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<IObserver> observers = new ArrayList<IObserver>();
    private List<String> students = new ArrayList<String>();
    public void addStudent(String name) {
        students.add(name);
        notifyObservers();
    }
    public void removeStudent(String name) {
        students.remove(name);
        notifyObservers();
    }
    public void addObserver(IObserver observer){
        observers.add(observer);
    }
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers(){
        for (IObserver observer : observers) {
            observer.event(students);
        }
    }
}
