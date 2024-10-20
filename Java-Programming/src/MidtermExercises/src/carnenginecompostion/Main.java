package carnenginecompostion;

public class Main {
    public static void main(String[] args) {
        Car gli = new Car("Jetta", new Engine("Turbo"));

        gli.startCar();
    }
}
