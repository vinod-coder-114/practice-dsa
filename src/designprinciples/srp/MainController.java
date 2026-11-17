package designprinciples.srp;

/**
 * Single Responsibility Principle (SRP) states that a class should have only one reason to change.
 * In other words, a class should have only one responsibility or job.
 * This principle helps in creating more maintainable and understandable code by ensuring that each class focuses on a single aspect of the functionality.
 */
public class MainController {
    public static void main(String[] args) {
        // create an object for OrderService
        OrderService orderService = new OrderService();
        orderService.createOrder("");
    }
}
