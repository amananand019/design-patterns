package designPatterns.abstractFactory.guiFactory;

import designPatterns.abstractFactory.button.IButton;
import designPatterns.abstractFactory.textBox.ITextBox;

public interface OperatingSystem {
    IButton createButton();

    ITextBox createTextBox();
}
