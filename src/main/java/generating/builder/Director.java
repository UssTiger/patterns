package generating.builder;

import generating.builder.build.CarBuilder;
import generating.builder.cars.Car;

public class Director {

    Car constructTruck(CarBuilder carBuilder) {
        carBuilder.builder();
        carBuilder.setCarName("SuperTruck");
        carBuilder.setCarType("Dragon");
        carBuilder.setCountDoors(5);
        carBuilder.setCountSeats(4);
        carBuilder.setMaxSpeed(80);
        return carBuilder.build();
    }

    Car constructSityCar(CarBuilder carBuilder) {
        carBuilder.builder();
        carBuilder.setCarName("CityCar");
        carBuilder.setCarType("EasyCar");
        carBuilder.setCountDoors(4);
        carBuilder.setCountSeats(8);
        carBuilder.setMaxSpeed(320);
        return carBuilder.build();
    }

}
