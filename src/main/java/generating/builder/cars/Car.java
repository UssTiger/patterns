package generating.builder.cars;

public abstract class Car {
    protected String name;
    protected String type;
    protected int countSeats;
    protected int countDoors;
    protected int maxSpeed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCountSeats() {
        return countSeats;
    }

    public void setCountSeats(int countSeats) {
        this.countSeats = countSeats;
    }

    public int getCountDoors() {
        return countDoors;
    }

    public void setCountDoors(int countDoors) {
        this.countDoors = countDoors;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
