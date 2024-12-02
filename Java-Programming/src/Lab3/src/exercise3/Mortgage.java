package exercise3;

    public abstract class Mortgage implements MortgageConstants {
        protected int mortgageNumber;
        protected String customerName;
        protected double amount;
        protected double interestRate;
        protected int term;

        public Mortgage(int mortgageNumber, String customerName, double amount, double interestRate, int term) {
            this.mortgageNumber = mortgageNumber;
            this.customerName = customerName;


            if (amount > MAX_MORTGAGE_AMOUNT) {
                this.amount = MAX_MORTGAGE_AMOUNT;
            } else {
                this.amount = amount;
            }


            if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM) {
                this.term = SHORT_TERM;
            } else {
                this.term = term;
            }

            this.interestRate = interestRate;
        }

        public abstract void setInterestRate(double primeRate);


        public String getMortgageInfo() {
            return String.format("Mortgage Number: %d%nCustomer Name: %s%nAmount: %.2f%nInterest Rate: %.2f%%%nTerm: %d years%nBank: %s%n",
                    mortgageNumber, customerName, amount, interestRate, term, BANK_NAME);
        }
    }
