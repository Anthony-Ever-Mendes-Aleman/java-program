package shapncircleinheritance;

public class Shape {
    protected String color;
    public Shape(String color) {
        this.color = color;
    }
    protected void draw(){
        System.out.println("Drawing a shape");
    }
}

