package main.java.ru.cti.commandPatterns.cor;

public class Main {
    public static void main(String[] args) {
        IPayment visaPayment = new VisaPayment();
        IPayment payPalPayment = new PayPalPayment();
        visaPayment.setNext(payPalPayment);
        visaPayment.pay();
    }
}
