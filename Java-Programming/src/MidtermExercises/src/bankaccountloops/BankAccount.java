package bankaccountloops;

public class BankAccount {
    protected double balance;
    protected String accountHolderName;
    protected final int ACCOUNT_NUMBER;

    public BankAccount() {
        this.balance = 0;
        this.accountHolderName = "N/A";
        this.ACCOUNT_NUMBER = 0;
    }
    public BankAccount(double initialBalance, String accountHolderName, int accountNumber) {
        this.balance = initialBalance;
        this.accountHolderName = accountHolderName;
        this.ACCOUNT_NUMBER = accountNumber;
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
    public void displayBalance() {
        System.out.println("Balance: " + this.balance);
    }

}

