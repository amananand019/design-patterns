package designPatterns.singleton;

public class ChocolateBoiler2 {
    private boolean empty;
    private boolean boiled;
    private static final ChocolateBoiler2 uniqueInstance = new ChocolateBoiler2();

    private ChocolateBoiler2() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler2 getInstance() {
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) { // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
