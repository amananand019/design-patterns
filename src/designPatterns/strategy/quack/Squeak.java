package designPatterns.strategy.quack;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("designPatterns.strategy.quack.Squeak");
    }
}
