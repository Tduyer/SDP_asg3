package Pac;

public class LocalPayService implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing LocalPay payment of $" + amount);
    }
}
