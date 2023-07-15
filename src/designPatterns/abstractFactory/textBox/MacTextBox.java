package designPatterns.abstractFactory.textBox;

public class MacTextBox implements ITextBox {
    @Override
    public void showText() {
        System.out.println("Mac Text Box is showing");
    }
}
