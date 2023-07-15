package designPatterns.decorator.decorator;

import designPatterns.decorator.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
