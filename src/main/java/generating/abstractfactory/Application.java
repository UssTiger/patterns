package generating.abstractfactory;

import generating.abstractfactory.factory.GUIFactory;
import generating.abstractfactory.products.Button;
import generating.abstractfactory.products.CheckBox;

public class Application {

    private final Button button;
    private final CheckBox checkBox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void print() {
        button.printButton();
        checkBox.printCheckBox();
    }

}
