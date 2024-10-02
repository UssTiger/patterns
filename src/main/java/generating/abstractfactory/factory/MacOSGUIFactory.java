package generating.abstractfactory.factory;

import generating.abstractfactory.products.Button;
import generating.abstractfactory.products.CheckBox;
import generating.abstractfactory.products.MacOSButton;
import generating.abstractfactory.products.MacOSCheckBox;

public class MacOSGUIFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }

}
