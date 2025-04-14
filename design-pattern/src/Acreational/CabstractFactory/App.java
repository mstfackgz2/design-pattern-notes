package Acreational.CabstractFactory;

import Acreational.CabstractFactory.interfaces.Button;
import Acreational.CabstractFactory.interfaces.GUIFactory;
import Acreational.CabstractFactory.interfaces.TextBox;

public class App {
    private Button button;
    private TextBox textBox;

    public App(GUIFactory factory){
        this.button = factory.createButton();
        this.textBox = factory.createTextBox();
    }

    public void renderUI(){
        button.render();
        textBox.render();
    }
}
