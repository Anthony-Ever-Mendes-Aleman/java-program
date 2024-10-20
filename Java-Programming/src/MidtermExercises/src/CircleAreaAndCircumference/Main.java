package CircleAreaAndCircumference;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(30.5);

        System.out.printf("\nRadius: %.2f", circle.getRadius() );
        System.out.printf("\nArea: %.2f", circle.calculateArea());
        System.out.printf("\nCircumference: %.2f", circle.calculateCircumference());
    }
}
