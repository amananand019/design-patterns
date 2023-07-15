package designPatterns.strategy;


import designPatterns.strategy.ducks.Duck;
import designPatterns.strategy.ducks.MallardDuck;
import designPatterns.strategy.ducks.ModelDuck;
import designPatterns.strategy.fly.FlyRockerPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.perFormFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.perFormFly();
        modelDuck.setFlyBehavior(new FlyRockerPowered());
        modelDuck.performQuack();
        modelDuck.perFormFly();
    }
}
