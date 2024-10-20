package RectangleAreaPractice;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public void setHeight(double height) {this.height = height;}

    public void setWidth(double width) {this.width = width;}

    public double getHeight() {return height;}

    public double getWidth() {return width;}

    public double calculateArea() {return width*height;}

    public double calculatePerimeter() {return 2 * (width + height);}

}
