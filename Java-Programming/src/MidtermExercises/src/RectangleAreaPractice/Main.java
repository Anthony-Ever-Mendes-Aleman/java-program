package RectangleAreaPractice;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);


        System.out.println("Rectangle 1 has a width of " + rectangle.getWidth() + " and a height of " + rectangle.getHeight() + " a area of" + rectangle.calculateArea()
        + " and a perimeter of " + rectangle.calculatePerimeter());
    }
}