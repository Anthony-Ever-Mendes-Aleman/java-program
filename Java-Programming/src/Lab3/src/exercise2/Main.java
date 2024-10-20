package exercise2;
import exercise1.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the name of the Game Tester: ");
            String name = scanner.nextLine();

            System.out.print("\nIs this tester Full Time?(Yes/No): ");
            String isFullTime = scanner.nextLine();

            if (isFullTime.toLowerCase().equals("yes")) {
                FullTimeGameTester fullTime1 = new FullTimeGameTester(name);
                System.out.println(fullTime1.toString());

            } else if (isFullTime.toLowerCase().equals("no")) {
                System.out.print("Hours worked monthly: ");
                int hours = scanner.nextInt();
                PartTimeGameTester partTime1 = new PartTimeGameTester(name, hours);
                System.out.println(partTime1.toString());
            } else {
                System.out.print("Please enter a valid status.");
        }
    }
}
