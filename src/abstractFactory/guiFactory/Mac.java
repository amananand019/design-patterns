package abstractFactory.guiFactory;

import abstractFactory.button.IButton;
import abstractFactory.button.MacButton;
import abstractFactory.textBox.ITextBox;
import abstractFactory.textBox.MacTextBox;

public class Mac implements OperatingSystem {
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new MacTextBox();
    }
}
