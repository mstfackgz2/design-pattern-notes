package Acreational;

import Acreational.CabstractFactory.App;
import Acreational.CabstractFactory.factories.MacFactory;
import Acreational.CabstractFactory.factories.WinowsFactory;
import Acreational.CabstractFactory.interfaces.GUIFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")){
            factory = new WinowsFactory();
        } else  {
            factory = new MacFactory();
        }

        App app = new App(factory);

        app.renderUI();




    }
}
