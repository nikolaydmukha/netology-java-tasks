package main.java.ru.cti.parentsPatterns.singleton;

public class PlayerOne {
    protected int level = 1;

    public void levelUP(int levels) {
        System.out.println("Апгрейд с  уронвя" + level + " на " + levels + " уровней");
        int cost = levels * 10;
        System.out.println("Цена " + cost);

        PaymentSystem wallet = PaymentSystem.get();
        if(wallet.pay(cost)) {
            level += levels;
            System.out.println("Апгрейднули игрока");
        }
        else {
            System.out.println("Не получилось");
        }

    }
}
