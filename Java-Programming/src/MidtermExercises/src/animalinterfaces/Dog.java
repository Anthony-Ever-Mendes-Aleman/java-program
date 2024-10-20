package animalinterfaces;

public class Dog extends Animal implements SoundMaker{
    public Dog(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
    @Override
    public void move(){
        System.out.println("Dog is running");
    }


}
