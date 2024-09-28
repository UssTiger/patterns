package generating.factorymethod;

import generating.factorymethod.logistic.Logistic;
import generating.factorymethod.logistic.RoadLogistic;
import generating.factorymethod.logistic.SeaLogistic;
import generating.factorymethod.transport.TransportType;

import java.util.Arrays;

public class TestFactoryMethod {

    public static void main(String[] args) {
        Arrays.stream(TransportType.values()).forEach(transportType -> {
            Logistic logistic = getLogistic(transportType);
            logistic.createTransport().deliver();
        });
    }

    private static Logistic getLogistic(TransportType type) {
        Logistic logistic;
        switch (type) {
            case ROAD:
                logistic = new RoadLogistic();
                break;
            case SEA:
                logistic = new SeaLogistic();
                break;
            default:
                logistic = null;
        }
        return logistic;
    }

}
