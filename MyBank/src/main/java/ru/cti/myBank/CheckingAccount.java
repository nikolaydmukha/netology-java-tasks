package main.java.ru.cti.myBank;

public class CheckingAccount extends Account{
    int balance = 0;
    String name;

    public CheckingAccount(String name, int balance) {
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
    public String pay(int amount) {
        System.out.println("Попытка оплатить со счёта " + this.name);
        if (this.balance - amount < 0) {
            System.out.println("Недостаточно средств на счете " + this.name +
                    " С таким переводом вы выйдеие в плюс, что недопустимо для этого счета.");
            return null;
        }
        this.balance += amount;
        System.out.println("Платеж успешно проведён. Новый баланс счета " + this.getName() + ": " + this.getBalance());
        return null;
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
}
