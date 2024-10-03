package generating.builder;

import generating.builder.build.CarBuilder;
import generating.builder.build.TruckBuilder;

public class TestBuilder {

    public static void main(String[] args) {
        CarBuilder carBuilder = new TruckBuilder();
        Director director = new Director();

        var truck = director.constructTruck(carBuilder);
        System.out.println(truck);
    }

}
