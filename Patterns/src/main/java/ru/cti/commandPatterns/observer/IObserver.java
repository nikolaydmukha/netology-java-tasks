package main.java.ru.cti.commandPatterns.observer;

import java.util.List;

public interface IObserver {
    void event(List<String> strings);
}

