package designprinciples.ocp;

public class UPIPayment implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing the UPI payment of amount: " + amount);
    }
}
