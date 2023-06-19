package singleton;

public class ChocolateBoiler3 {
    public static void main(String[] args) {
        ChocolateBoilerEnum obj1 = ChocolateBoilerEnum.UNIQUE_INSTANCE;
        obj1.fill();
        System.out.println("obj1 is boiled: " + obj1.isBoiled());

        ChocolateBoilerEnum obj2 = ChocolateBoilerEnum.UNIQUE_INSTANCE;
        obj2.fill();
        obj2.boil();

        System.out.println("obj1 is boiled: " + obj1.isBoiled());
    }
}

enum ChocolateBoilerEnum {
    UNIQUE_INSTANCE;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoilerEnum() {
        empty = true;
        boiled = false;
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




