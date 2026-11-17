package designprinciples.lsp;

/**
 * This class demonstrates the Liskov Substitution Principle (LSP) by allowing any bird that implements the Flyable interface to be used interchangeably.
 *
 */
public class MainController {

    public static void main(String[] args) {
        MainController mainController = new MainController();
        Parrot parrot = new Parrot();
        parrot.eat("Parrot");
        mainController.makeBirdFly(parrot);
    }

    public void makeBirdFly(Flyable bird) {
        bird.fly();
    }
}
