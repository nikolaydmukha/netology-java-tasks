package main.java.ru.cti.myBank;

public class Main {
    public static void main(String[] args) {
        Account saving = new SavingAccount("Сберегательный", 1000);
        Account credit = new CreditAccount("Кредитный",-100000);
        Account checking = new CheckingAccount("Расчетный", 10000000);

        saving.transfer(checking, 900);
        saving.addMoney(150);


        credit.transfer(saving, 110000);
        credit.pay(100);

        saving.transfer(checking, 50);
    }

}
