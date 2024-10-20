package vehicleandcar;

public class Vehicle {
    protected int speed;
    public Vehicle(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void move(){
        System.out.println("Vehicle is moving at " + this.getSpeed() + " KM/H");

    }
}
