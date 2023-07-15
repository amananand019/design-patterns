package designPatterns.abstractFactory.guiFactory;

import designPatterns.abstractFactory.button.IButton;
import designPatterns.abstractFactory.button.MacButton;
import designPatterns.abstractFactory.textBox.ITextBox;
import designPatterns.abstractFactory.textBox.MacTextBox;

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
