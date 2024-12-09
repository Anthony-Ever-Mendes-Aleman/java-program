import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountTest {
    public static void main(String[] args) {

        Account account = new Account(1000, 123);

        ArrayList<MyRunnable> transactions = new ArrayList<MyRunnable>();

        transactions.add(new MyRunnable(account, "deposit", 500));
        transactions.add(new MyRunnable(account, "withdraw", 300));
        transactions.add(new MyRunnable(account, "deposit", 200));
        transactions.add(new MyRunnable(account, "withdraw", 700));
        transactions.add(new MyRunnable(account, "withdraw", 1000));


        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (MyRunnable myRunnable : transactions) {
            executorService.execute(myRunnable);

        }
        executorService.shutdown();
    }
}