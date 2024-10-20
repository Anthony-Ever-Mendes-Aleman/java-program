package personandemployee;

public class Employee extends Person {

    private double salary;
    public Employee(String firstName, int age, double salary) {
        super(firstName, age);
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Salary: " + salary);
    }

}
