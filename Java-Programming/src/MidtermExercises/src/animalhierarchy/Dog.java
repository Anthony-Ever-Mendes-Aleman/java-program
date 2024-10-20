package animalhierarchy;
import animalhierarchy.Animal;
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void move() {

    }

    @Override
    protected void makeSound(){
        System.out.println("BARK");
    }
}
