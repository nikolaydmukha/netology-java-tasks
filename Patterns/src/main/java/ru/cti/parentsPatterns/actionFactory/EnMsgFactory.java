package main.java.ru.cti.parentsPatterns.actionFactory;

public class EnMsgFactory implements MsgFactory {
    @Override
    public ErrorMessenger createErrorMessenger(String user) {
        return (errCode) -> System.out.println("Dear " + user + ", error #" + errCode + "!");
    }

    @Override
    public ByeMessenger createByeMessenger() {
        return () -> System.out.println("Bye forever!");
    }
}
