package main.java.ru.cti.commandPatterns.cor;

public interface IPayment {
    void setNext(IPayment payment);
    void pay();
}
