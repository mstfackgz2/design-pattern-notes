package Acreational.CabstractFactory.factories;

import Acreational.CabstractFactory.interfaces.Button;
import Acreational.CabstractFactory.interfaces.GUIFactory;
import Acreational.CabstractFactory.interfaces.TextBox;
import Acreational.CabstractFactory.product.MacButton;
import Acreational.CabstractFactory.product.MacTextBox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MacTextBox();
    }
}
