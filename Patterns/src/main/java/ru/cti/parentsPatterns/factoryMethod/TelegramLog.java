package main.java.ru.cti.parentsPatterns.factoryMethod;

import main.java.ru.cti.parentsPatterns.builder.ILog;

public class TelegramLog implements ILog {

    @Override
    public void log(String msg) {
        System.out.println("From Telegram Log");

    }
}
