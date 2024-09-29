package generating.builder.build;

import generating.builder.cars.Car;
import generating.builder.cars.TruckCar;

public class TruckBuilder implements CarBuilder{

    private TruckCar truckCar;

    @Override
    public void builder() {
        truckCar = new TruckCar();
    }

    @Override
    public void setCarName(String carName) {
        truckCar.setName(carName);
    }

    @Override
    public void setCarType(String carType) {
        truckCar.setType(carType);
    }

    @Override
    public void setCountSeats(int countSeats) {
        truckCar.setCountSeats(countSeats);
    }

    @Override
    public void setCountDoors(int countDoors) {
        truckCar.setCountDoors(countDoors);
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        truckCar.setMaxSpeed(maxSpeed);
    }

    @Override
    public Car build() {
        return truckCar;
    }
}
