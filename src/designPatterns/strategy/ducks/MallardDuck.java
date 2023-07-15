package designPatterns.strategy.ducks;

import designPatterns.strategy.fly.FlyWithWings;
import designPatterns.strategy.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }
}
