package designPatterns.abstractFactory.guiFactory;

import designPatterns.abstractFactory.button.IButton;
import designPatterns.abstractFactory.button.WindowsButton;
import designPatterns.abstractFactory.textBox.ITextBox;
import designPatterns.abstractFactory.textBox.WindowsTextBox;

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
