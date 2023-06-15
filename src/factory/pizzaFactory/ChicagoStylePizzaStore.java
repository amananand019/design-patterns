package factory.pizzaFactory;

import factory.pizzas.ChicagoStyleCheesePizza;
import factory.pizzas.ChicagoStylePepperoniPizza;
import factory.pizzas.Pizza;

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
