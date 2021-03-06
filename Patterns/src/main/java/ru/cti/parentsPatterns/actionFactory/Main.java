package main.java.ru.cti.parentsPatterns.actionFactory;

public class Main {
    public static void main(String[] args) {
        boolean isEng = false;
        MsgFactory factory = isEng ? new EnMsgFactory() : new RuMsgFactory();
        ErrorMessenger err = factory.createErrorMessenger("Лёшка");
        ByeMessenger bye = factory.createByeMessenger();

        err.print(403);
        bye.bye();
    }
}
