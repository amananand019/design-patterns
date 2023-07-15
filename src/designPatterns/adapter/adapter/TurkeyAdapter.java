package designPatterns.adapter.adapter;

import designPatterns.adapter.animals.Duck;
import designPatterns.adapter.animals.Turkey;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++)
            turkey.fly();
    }
}
