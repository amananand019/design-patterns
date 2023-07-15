package designPatterns.factory.pizzaFactory;

import designPatterns.factory.pizzas.NYStyleCheesePizza;
import designPatterns.factory.pizzas.NYStylePepperoniPizza;
import designPatterns.factory.pizzas.Pizza;

public class NyStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else {
            pizza = new NYStyleCheesePizza();
        }

        return pizza;
    }
}
