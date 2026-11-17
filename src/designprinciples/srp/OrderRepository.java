package designprinciples.srp;

/**
 * This class is responsible for handling all database operations related to orders.
 */
public class OrderRepository {
    public void saveOrder(String orderDetails) {
        // Logic to save order details to the database
        System.out.println("Order saved to database: " + orderDetails);
    }
}
