package Bankaccountinheritance;

public class Checking extends Bankaccount {
    protected double transactionFee;
    public Checking(double transactionFee, int accountNumber, double balance) {
        super(accountNumber, balance);
        this.transactionFee = transactionFee;
    }
    @Override
    public void withdraw(double amount){
        if (amount > this.balance) {
            this.balance -= amount;
            this.balance -= this.transactionFee;
            System.out.println("Withdrawal successful");
        }
        else {
            System.out.println("Withdrawal failed");
        }
    }
}
