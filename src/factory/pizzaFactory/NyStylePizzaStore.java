package factory.pizzaFactory;

import factory.pizzas.NYStyleCheesePizza;
import factory.pizzas.NYStylePepperoniPizza;
import factory.pizzas.Pizza;

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
