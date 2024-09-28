package generating.factorymethod.transport;

public class RoadTransport implements Transport {

    @Override
    public void deliver() {
        System.out.println("Я Машинка и я доставлю груз по земле!!!");
    }

}
