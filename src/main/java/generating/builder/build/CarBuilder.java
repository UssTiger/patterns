package generating.builder.build;

import generating.builder.cars.Car;

public interface CarBuilder {
    void builder();
    void setCarName(String carName);
    void setCarType(String carType);
    void setCountSeats(int countSeats);
    void setCountDoors(int countDoors);
    void setMaxSpeed(int maxSpeed);
    Car build();
}
