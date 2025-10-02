package Pac;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor localPay = new LocalPayService();
        localPay.processPayment(100.0);

        PaymentProcessor fastPay = new FastPayAdapter(new FastPayApi());
        fastPay.processPayment(200.0);
    }
}