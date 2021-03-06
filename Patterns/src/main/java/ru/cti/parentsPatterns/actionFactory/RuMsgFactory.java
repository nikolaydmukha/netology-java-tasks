package main.java.ru.cti.parentsPatterns.actionFactory;

public class RuMsgFactory implements MsgFactory{
    @Override
    public ErrorMessenger createErrorMessenger(String user) {
        return (errCode) -> System.out.println("Уважаемый " + user + ", произошла ошибка №" + errCode + "!");
    }

    @Override
    public ByeMessenger createByeMessenger() {
        return () -> System.out.println("А теперь прощайте!");
    }
}
