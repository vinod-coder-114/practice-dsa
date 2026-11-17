package designprinciples.srp;

public class ControllerMain {
    public static void main(String[] args) {
        PaymentProcessor upiPayment = new UPIPayment();
        upiPayment.processPayment(1500.98);
    }
}
