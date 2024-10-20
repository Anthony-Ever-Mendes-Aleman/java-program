package shapncircleinheritance;

public class Circle extends Shape {
    protected double radius;
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius " + radius + " and color " + color);

    }
}
