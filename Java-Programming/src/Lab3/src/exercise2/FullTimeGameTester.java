package exercise2;

public class FullTimeGameTester extends GameTester
{
    public FullTimeGameTester(String name){
        super(name, true);
    }
    @Override
    public double salary(){
        return 3000;
    }

    public String toString(){
        return "Full Time Game tester : " + getName() + "\nThe determined monthly salary: " + salary();
    }
}
