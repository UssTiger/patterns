package generating.builder.build;

import generating.builder.cars.Car;
import generating.builder.cars.CityCar;

public class CityCarBuilder implements CarBuilder{

    private CityCar cityCar;

    @Override
    public void builder() {
        cityCar = new CityCar();
    }

    @Override
    public void setCarName(String carName) {
        cityCar.setName(carName);
    }

    @Override
    public void setCarType(String carType) {
        cityCar.setType(carType);
    }

    @Override
    public void setCountSeats(int countSeats) {
        cityCar.setCountSeats(countSeats);
    }

    @Override
    public void setCountDoors(int countDoors) {
        cityCar.setCountDoors(countDoors);
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        cityCar.setMaxSpeed(maxSpeed);
    }

    @Override
    public Car build() {
        return cityCar;
    }

}
