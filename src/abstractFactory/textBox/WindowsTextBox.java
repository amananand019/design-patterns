package abstractFactory.textBox;

public class WindowsTextBox implements ITextBox {
    @Override
    public void showText() {
        System.out.println("Windows text box is showing");
    }
}
