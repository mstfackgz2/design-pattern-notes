package Acreational.CabstractFactory.factories;

import Acreational.CabstractFactory.interfaces.Button;
import Acreational.CabstractFactory.interfaces.GUIFactory;
import Acreational.CabstractFactory.interfaces.TextBox;
import Acreational.CabstractFactory.product.WindowsButton;
import Acreational.CabstractFactory.product.WindowsTextBox;

public class WinowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WindowsTextBox();
    }
}
