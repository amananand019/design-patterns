package designPatterns.factory;

import designPatterns.factory.pizzaFactory.ChicagoStylePizzaStore;
import designPatterns.factory.pizzaFactory.NyStylePizzaStore;
import designPatterns.factory.pizzaFactory.PizzaStore;
import designPatterns.factory.pizzas.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
