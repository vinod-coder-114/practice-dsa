package designprinciples.srp;

public class CardPayment implements PaymentProcessor{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing the card payment of amount: " + amount);
    }
}
