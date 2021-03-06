package main.java.ru.cti.parentsPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        PaymentSystem wallet = PaymentSystem.get();
        wallet.add(100);

        PlayerOne playerOne = new PlayerOne();
        playerOne.levelUP(100);
    }
}
