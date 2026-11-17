package designprinciples.ocp;

/**
 * Open/Closed Principle (OCP) states that software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
 * without OCP, if we want to add a new payment method, we would have to modify the existing code, which can lead to bugs and maintenance issues.
 * By following OCP, we can add new payment methods without changing the existing code, making it more robust and easier to maintain.
 */
public class ControllerMain {
    public static void main(String[] args) {
        PaymentProcessor upiPayment = new UPIPayment();
        upiPayment.processPayment(1500.98);
    }
}
