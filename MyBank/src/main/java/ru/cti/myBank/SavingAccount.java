package main.java.ru.cti.myBank;

public class SavingAccount extends Account{
    int balance = 0;
    String name;

    public SavingAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    public void setNewBalance(int amount) {
        this.balance += amount;
    }

    @Override
    public String transfer(Account account, int amount) {
        System.out.println("Попытка перевести деньги со счёта " + this.name + " на счет " + account.getName());
        if (this.balance - amount < 0) {
            System.out.println("Недостаточно средств на счете " + this.name);
            return null;
        }
        this.balance -= amount;
        account.setNewBalance(amount);
        System.out.println("Перевод успешно проведён. Новый баланс счета " + account.getName() + ": " + account.getBalance() +
                "\nНовый баланс счета " + this.getName() + ": " + this.getBalance());
        return null;
    }

    @Override
    public void addMoney(int amount) {
        System.out.println("Добавляем сумму " + amount + " к счету " + this.name);
        this.setNewBalance(amount);
    }

    @Override
    public String pay(int amount) {
        System.out.println("Со сберегательного счета нельзя оплачивать!");
        return null;
    }
}
