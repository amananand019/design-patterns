package decorator;

import decorator.component.Beverage;
import decorator.component.DarkRoast;
import decorator.component.Espresso;
import decorator.component.HouseBlend;
import decorator.decorator.Mocha;
import decorator.decorator.Soy;
import decorator.decorator.Whip;

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

    public static void getBeverage(Beverage beverage){
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());
    }
}
