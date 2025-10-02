package Pac;

public class FastPayAdapter implements PaymentProcessor {
    private final FastPayApi fastPayApi;

    public FastPayAdapter(FastPayApi fastPayApi) {
        this.fastPayApi = fastPayApi;
    }

    @Override
    public void processPayment(double amount) {
        fastPayApi.pay(amount);
    }
}
