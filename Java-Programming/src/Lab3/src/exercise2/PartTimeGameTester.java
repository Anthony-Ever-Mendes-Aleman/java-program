package exercise2;

public class PartTimeGameTester extends GameTester {

    protected double hoursWorked;

    public void setHoursWorked(double hoursWorked) {}
    public double getHoursWorked() { return hoursWorked; }
    public PartTimeGameTester(String name, double hoursWorked) {
        super(name, false);
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double salary(){
        return 20 * hoursWorked;
    }
    public String toString(){
        return "Part Time Game tester : " + getName() + "\nThe determined monthly salary: " + salary();
    }
}
