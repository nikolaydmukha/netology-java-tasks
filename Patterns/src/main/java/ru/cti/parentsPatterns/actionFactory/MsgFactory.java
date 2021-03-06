package main.java.ru.cti.parentsPatterns.actionFactory;

public interface MsgFactory {
    ErrorMessenger createErrorMessenger(String user);
    ByeMessenger createByeMessenger();
}
