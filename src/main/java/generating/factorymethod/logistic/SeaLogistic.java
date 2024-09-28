package generating.factorymethod.logistic;

import generating.factorymethod.transport.SeaTransport;
import generating.factorymethod.transport.Transport;

public class SeaLogistic extends Logistic {

    @Override
    public Transport createTransport() {
        return new SeaTransport();
    }

}
