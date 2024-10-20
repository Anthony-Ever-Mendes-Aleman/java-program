package animalhierarchy;
import animalhierarchy.Animal;
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {

    }

    @Override
    protected void makeSound(){
        System.out.println("Meow");
    }
}
