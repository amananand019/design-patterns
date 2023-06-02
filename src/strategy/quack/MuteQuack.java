package strategy.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Mute strategy.quack.Quack");
    }
}
