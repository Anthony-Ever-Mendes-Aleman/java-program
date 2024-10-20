package VehicleAbstractpoly;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(50);
        Bike bike = new Bike(20);

        car.move();
        bike.move();
    }
}
