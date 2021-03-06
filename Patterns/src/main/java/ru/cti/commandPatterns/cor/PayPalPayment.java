package main.java.ru.cti.commandPatterns.cor;

public class PayPalPayment  implements IPayment{
    private IPayment payment;
    public void setNext(IPayment payment) {
        this.payment = payment;
    }
    public void pay() {
        System.out.println("PayPal Payment");
    }
}
