package factory;

import factory.pizzaFactory.ChicagoStylePizzaStore;
import factory.pizzaFactory.NyStylePizzaStore;
import factory.pizzaFactory.PizzaStore;
import factory.pizzas.Pizza;

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
