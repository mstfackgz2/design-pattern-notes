package Acreational.CabstractFactory.product;

import Acreational.CabstractFactory.interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows butonu çizildi.");
    }
}
