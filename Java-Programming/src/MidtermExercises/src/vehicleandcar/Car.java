package vehicleandcar;

public class Car extends Vehicle {
    protected int fuelLevel;
    public Car(int fuelLevel, int speed) {
        super(speed);
        this.fuelLevel = fuelLevel;
    }
    public int getFuelLevel() {
        return fuelLevel;
    }
    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void move(){
        System.out.println("The vehicle is moving at " + this.getSpeed() + " km/h, with a fuel level of " + this.fuelLevel + "%" );

    }
}
