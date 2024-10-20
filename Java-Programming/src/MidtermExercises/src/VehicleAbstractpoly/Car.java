package VehicleAbstractpoly;

public class Car extends Vehicle {
    public Car(int speed){
        super(speed);
    }
    public void move(){
        System.out.println("Car is moving" + speed + " KM/H");
    }
}
