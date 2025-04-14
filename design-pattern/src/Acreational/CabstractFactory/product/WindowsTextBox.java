package Acreational.CabstractFactory.product;

import Acreational.CabstractFactory.interfaces.Button;
import Acreational.CabstractFactory.interfaces.TextBox;

public class WindowsTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Windows textbox'ı çizildi.");
    }
}
