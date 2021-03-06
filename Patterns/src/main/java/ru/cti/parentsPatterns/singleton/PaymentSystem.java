package main.java.ru.cti.parentsPatterns.singleton;

public class PaymentSystem {
    protected  static PaymentSystem instance = null;
    protected int money;

    private PaymentSystem() {}

    protected void add (int amount) {
        money += amount;
        System.out.println("Пополнили");
    }
    protected boolean pay(int amount) {
        if (amount > money) {
            System.out.println("$ Не хватает, нужно " + amount + ", на счету " + money);
            return false;
        } else {
            money -= amount;
            System.out.println("$ Потратили " + amount + ", на счету " + money);
            return true;
        }
    }

    public static PaymentSystem get() {
        if (instance == null) instance = new PaymentSystem();
        return instance;
    }
}
