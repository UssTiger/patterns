package generating.factorymethod.logistic;

import generating.factorymethod.transport.RoadTransport;
import generating.factorymethod.transport.Transport;

public class RoadLogistic extends Logistic {

    @Override
    public Transport createTransport() {
        return new RoadTransport();
    }

}
