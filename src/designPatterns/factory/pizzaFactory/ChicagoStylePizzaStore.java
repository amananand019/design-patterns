package designPatterns.factory.pizzaFactory;

import designPatterns.factory.pizzas.ChicagoStyleCheesePizza;
import designPatterns.factory.pizzas.ChicagoStylePepperoniPizza;
import designPatterns.factory.pizzas.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else {
            pizza = new ChicagoStyleCheesePizza();
        }

        return pizza;
    }
}
