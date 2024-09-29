package generating.builder.cars;

public class TruckCar extends Car {

    @Override
    public String toString() {
        return "TruckCar {" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", countSeats=" + countSeats +
                ", countDoors=" + countDoors +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

}
