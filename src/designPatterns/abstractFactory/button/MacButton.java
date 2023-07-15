package designPatterns.abstractFactory.button;

public class MacButton implements IButton {
    @Override
    public void press() {
        System.out.println("Mac Button is pressed");
    }
}
