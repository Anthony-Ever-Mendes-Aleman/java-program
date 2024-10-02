package Lab3;
import javax.swing.*;

class Life extends Insurance
{

    @Override
    public void setInsurance()
    {
        setMonthlyCost(400);
        setType("Life");
    }

    @Override
    public void displayInfo()
    {
        String message = String.format("Insurance Details: %s \nMonthly Payment: %.2f", getType(), getMonthlyCost());
        JOptionPane.showMessageDialog(null, message);
    }
}