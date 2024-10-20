package exercise1;

public abstract class Insurance
{
        private String type;
        private double monthlyCost;

        public String getType()
        {
            return type;
        }

        public double getMonthlyCost()
        {
            return monthlyCost;
        }

        public void setType(String type)
        {
            this.type = type;
        }

        public void setMonthlyCost(double monthlyCost)
        {
            this.monthlyCost = monthlyCost;
        }

        public abstract void setInsurance();

        public abstract void displayInfo();

}