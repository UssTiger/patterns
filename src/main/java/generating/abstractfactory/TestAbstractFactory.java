package generating.abstractfactory;

import generating.abstractfactory.factory.GUIFactory;
import generating.abstractfactory.factory.MacOSGUIFactory;
import generating.abstractfactory.factory.WindowsGUIFactory;

public class TestAbstractFactory {

    private static Application configureApplication() {
        GUIFactory guiFactory;
        String name = System.getProperty("os.name").toLowerCase();
        if (name.contains("windows")) {
            guiFactory = new WindowsGUIFactory();
        } else {
            guiFactory = new MacOSGUIFactory();
        }
        return new Application(guiFactory);
    }

    public static void main(String[] args) {
        var application = configureApplication();
        application.print();
    }

}
