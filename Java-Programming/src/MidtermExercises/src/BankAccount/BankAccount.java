package BankAccount;

public class BankAccount {
    protected double balance;
    protected String accountHolderName;

    public BankAccount() {
        this.balance = 0;
        this.accountHolderName = "N/A";
    }
    public BankAccount(double initialBalance, String accountHolderName) {
        this.balance = initialBalance;
        this.accountHolderName = accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Successfully deposited " + amount + " to " + accountHolderName);
    }
    public void withdraw(double amount) {

        if (amount < this.balance) {
            this.balance -= amount;
            System.out.println("Successfully Withdrew $" + amount + " to " + accountHolderName);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

}
