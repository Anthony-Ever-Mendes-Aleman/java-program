package paymentsystempolymorphism;

public class Contractor implements Payable {
    protected String name;
    protected double hourlyRate;
    protected double hoursWorked;
    public Contractor(String name, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hourlyRate;
    }

    @Override
    public double pay(){
        return hourlyRate * hoursWorked;
    }
}
