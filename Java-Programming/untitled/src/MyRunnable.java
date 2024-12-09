public class MyRunnable implements Runnable {
    private final Account account;
    private final String type;
    private final int amount;


    public MyRunnable(Account account, String type, int amount) {
        this.account = account;
        this.amount = amount;
        this.type = type;
    }


    @Override
    public void run() {
        synchronized (account) {
            if ("deposit".equals(type)) {
                account.deposit(amount);
                System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". New balance: " + account.getBalance());
            } else if ("withdraw".equals(type)) {
                if (account.getBalance() < amount) {
                    System.out.println(Thread.currentThread().getName() + " failed to withdraw " + amount + " due to insufficient funds.");
                } else {
                    account.withdraw(amount);
                    System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". New balance: " + account.getBalance());
                }
            }
        }
    }
}