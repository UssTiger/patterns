package generating.builder.cars;

public class CityCar extends Car{

    @Override
    public String toString() {
        return "SityCar{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", countSeats=" + countSeats +
                ", countDoors=" + countDoors +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

}
