public class Account {
    protected int balance;
    protected int accountId;

    public Account(int balance, int accountId) {
        this.balance = balance;
        this.accountId = accountId;
    }


    public synchronized int getBalance() {
        return balance;
    }


    public synchronized int getAccountId() {
        return accountId;
    }

    public synchronized void setBalance(int balance) {
        this.balance = balance;
    }

    public synchronized void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
    }

    public synchronized void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}
