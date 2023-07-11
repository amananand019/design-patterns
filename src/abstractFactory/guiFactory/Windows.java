package abstractFactory.guiFactory;

import abstractFactory.button.IButton;
import abstractFactory.button.WindowsButton;
import abstractFactory.textBox.ITextBox;
import abstractFactory.textBox.WindowsTextBox;

public class Windows implements OperatingSystem {
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new WindowsTextBox();
    }
}
