package generating.factorymethod.transport;

public class SeaTransport implements Transport {

    @Override
    public void deliver() {
        System.out.println("Я Кораблик и я доставлю груз по воде!!!");
    }
}
