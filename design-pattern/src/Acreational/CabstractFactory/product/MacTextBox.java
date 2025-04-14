package Acreational.CabstractFactory.product;

import Acreational.CabstractFactory.interfaces.TextBox;

public class MacTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Mac textbox'ı çizildi.");
    }
}
