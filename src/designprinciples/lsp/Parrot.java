package designprinciples.lsp;

public class Parrot extends Bird implements Flyable {

    @Override
    public void eat(String name) {
        super.eat(name);
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }
}
