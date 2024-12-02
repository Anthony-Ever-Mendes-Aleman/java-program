package exercise3;

public class BusinessMortgage extends Mortgage {
    public BusinessMortgage(int mortgageNumber, String customerName, double amount, double primeRate, int term) {
        super(mortgageNumber, customerName, amount, primeRate, term);
        setInterestRate(primeRate);
    }

    @Override
    public void setInterestRate(double primeRate) {
        super.interestRate = primeRate + 1.0;
    }
}
