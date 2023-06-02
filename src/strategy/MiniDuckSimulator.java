package strategy;


import strategy.ducks.Duck;
import strategy.ducks.MallardDuck;
import strategy.ducks.ModelDuck;
import strategy.fly.FlyRockerPowered;

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
