package BankAccount;

public class Main {
public static void main(String[] args) {
    BankAccount account = new BankAccount(2000, "Anthony");
    System.out.println("Inital amount: " + account.getBalance());
    System.out.println("Deposit amount: 1000");
    account.deposit(1000);
    System.out.println("Withdraw amount: 2000");
    account.withdraw(2000);
    System.out.println("Current Balance: " + account.getBalance());

}
}
