package designPatterns.strategy.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Mute designPatterns.strategy.quack.Quack");
    }
}
