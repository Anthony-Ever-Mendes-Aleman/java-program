package animalhierarchy;

public abstract class Animal {

    protected String name;

    protected void makeSound(){
        System.out.println("RRRRROOFF");

    }
    public Animal(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public abstract void move();
}
