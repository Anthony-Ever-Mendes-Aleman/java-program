package paymentsystempolymorphism;

public class Employee implements Payable {
    protected String name;
    protected double salary;
    public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
    }
    @Override
    public double pay(){
        return salary;
    }
}
