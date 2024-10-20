package paymentsystempolymorphism;

public class Freelancer implements Payable{
    protected String name;
    protected double ratePerJob;
    protected double jobAmount;
    public Freelancer(String name) {
        this.name = name;
        this.ratePerJob = 200;
        this.jobAmount = 0;
    }
    public void setJobAmount(double jobAmount) {
        this.jobAmount = jobAmount;
    }
    public double getJobAmount() {
        return jobAmount;
    }
    @Override
    public double pay(){
        return jobAmount * ratePerJob;
    }

}
