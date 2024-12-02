package exercise3;

import java.util.Scanner;

public class ProcessMortgage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mortgage[] mortgages = new Mortgage[3];

        System.out.print("Enter the current prime interest rate: ");
        double primeRate = scanner.nextDouble();

        for (int i = 0; i < mortgages.length; i++) {
            System.out.print("Enter mortgage type (1 = Business, 2 = Personal): ");
            int mortgageType = scanner.nextInt();

            System.out.print("Enter mortgage number: ");
            int mortgageNumber = scanner.nextInt();

            scanner.nextLine();
            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();

            System.out.print("Enter mortgage amount: ");
            double amount = scanner.nextDouble();

            System.out.print("Enter term (1 = Short-term, 3 = Medium-term, 5 = Long-term): ");
            int term = scanner.nextInt();

            if (mortgageType == 1) {
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, amount, primeRate, term);
            } else if (mortgageType == 2) {
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, amount, primeRate, term);
            }
        }

        for (Mortgage mortgage : mortgages) {
            System.out.println(mortgage.getMortgageInfo());
            System.out.println("------------------------------");
        }

    }
}
