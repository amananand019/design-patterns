package designPatterns.adapter;

import designPatterns.adapter.adapter.TurkeyAdapter;
import designPatterns.adapter.animals.Duck;
import designPatterns.adapter.animals.MallardDuck;
import designPatterns.adapter.animals.Turkey;
import designPatterns.adapter.animals.WildTurkey;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says...");
        testDuck(duck);

        System.out.println("\nThe turkey designPatterns.adapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
