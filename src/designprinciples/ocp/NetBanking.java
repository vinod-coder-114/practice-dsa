package designprinciples.ocp;

public class NetBanking implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing the net banking payment of amount: " + amount);
    }
}
