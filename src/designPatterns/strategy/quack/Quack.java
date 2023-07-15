package designPatterns.strategy.quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("designPatterns.strategy.quack.Quack");
    }
}
