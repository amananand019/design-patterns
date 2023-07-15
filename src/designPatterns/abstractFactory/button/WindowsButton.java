package designPatterns.abstractFactory.button;

public class WindowsButton implements IButton {
    @Override
    public void press() {
        System.out.println("Windows button is pressed");
    }
}
