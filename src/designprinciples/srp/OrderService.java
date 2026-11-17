package designprinciples.srp;

/**
 * This class demonstrates the SRP by orchestrating the responsibilities of order management, database operations, and email notifications into different classes.
 *
 */
public class OrderService {
    public void createOrder(String orderDetails) {
        // Logic to create an order
        System.out.println("Order created: " + orderDetails);
        // save order to the database
        OrderRepository orderRepository = new OrderRepository();
        orderRepository.saveOrder(orderDetails);

        // send email notification
        NotificationService notificationService = new NotificationService();
        notificationService.sendEmailNotification("customer@example.com", "Your order has been created.");
    }
    public void cancelOrder(String orderId) {
        // Logic to cancel an order
        System.out.println("Order canceled: " + orderId);
    }
    /*public void saveDbChanges() {
        // Logic to save changes to the database
        System.out.println("Database changes saved.");
    }
    public void sendEmailNotification(String email, String message) {
        // Logic to send an email notification
        System.out.println("Email sent to " + email + ": " + message);
    }*/
}
