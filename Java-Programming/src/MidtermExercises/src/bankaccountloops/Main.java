package bankaccountloops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bank = new BankAccount(50000, "Anthony", 10230123);
    int choice;
        do{
            System.out.println("============");
            System.out.println("Options");
            System.out.println("1: Show Balance");
            System.out.println("2: Deposit");
            System.out.println("3: Withdraw");
            System.out.println("4: Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bank.displayBalance();
                    break;
                    case 2:
                        System.out.println("Deposit Amount: ");
                        bank.deposit(scanner.nextDouble());
                        break;
                        case 3:
                            System.out.println("Withdraw Amount: ");
                            bank.withdraw(scanner.nextDouble());
                            break;
                            case 4:
                                System.out.println("Exitted");
                                break;
                                default:
                                    System.out.println("Invalid option");
            }
        }while (choice != 4);
    }
}
