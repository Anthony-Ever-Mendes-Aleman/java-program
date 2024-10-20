package Bankaccountinheritance;

public class SavingsAccount extends Bankaccount {
    protected double interestRate;

    public SavingsAccount(double interestRate, int accountNumber, double balance) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void applyInterest(){
        this.interestRate = this.interestRate * balance;
    }

}
