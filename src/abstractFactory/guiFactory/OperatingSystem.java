package abstractFactory.guiFactory;

import abstractFactory.button.IButton;
import abstractFactory.textBox.ITextBox;

public interface OperatingSystem {
    IButton createButton();

    ITextBox createTextBox();
}
