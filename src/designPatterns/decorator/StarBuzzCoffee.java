package designPatterns.decorator;

import designPatterns.decorator.component.Beverage;
import designPatterns.decorator.component.DarkRoast;
import designPatterns.decorator.component.Espresso;
import designPatterns.decorator.component.HouseBlend;
import designPatterns.decorator.decorator.Mocha;
import designPatterns.decorator.decorator.Soy;
import designPatterns.decorator.decorator.Whip;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        getBeverage(espresso);

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        getBeverage(darkRoast);

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Whip(houseBlend);
        getBeverage(houseBlend);
    }

    public static void getBeverage(Beverage beverage) {
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());
    }
}
