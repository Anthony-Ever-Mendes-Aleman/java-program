package VehicleAbstractpoly;

public abstract class Vehicle {
    protected int speed;
    public Vehicle(int speed) {
        this.speed = speed;
    }
    protected abstract void move();
    protected void accelerate(){
        speed += speed;
    }
}
