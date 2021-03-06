package main.java.ru.cti.myBank;

interface IAccounts {
//    int balance = 0;

    String pay(int amount);

    String transfer(Account account, int amount);

    void addMoney(int amount);

    void setNewBalance(int amount);

    String getName();

    int getBalance();

}
