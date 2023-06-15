package factory.pizzas;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Pepperoni Cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
