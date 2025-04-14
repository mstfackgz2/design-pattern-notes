package Acreational.CabstractFactory.product;

import Acreational.CabstractFactory.interfaces.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Mac butonu çizildi.");
    }
}
