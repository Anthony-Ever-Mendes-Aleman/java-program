package VehicleAbstractpoly;

public class Bike extends Vehicle {
    public Bike(int speed){
        super(speed);
    }

    public void move(){
        System.out.println("Bike is moving at " + speed + " KM/H");
    }

}
