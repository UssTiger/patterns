package generating.abstractfactory.factory;

import generating.abstractfactory.products.Button;
import generating.abstractfactory.products.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
