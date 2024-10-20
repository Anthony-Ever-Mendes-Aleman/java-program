package animalinterfaces;

public class Bird extends Animal implements SoundMaker{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Bird is flying");
    }
    @Override
    public void makeSound() {
        System.out.println("tweet");
    }
}
