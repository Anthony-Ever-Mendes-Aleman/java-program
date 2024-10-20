package exercise1;

import javax.swing.*;

class Health extends Insurance
{
    @Override
    public void setInsurance()
    {
        setType("Health");
        setMonthlyCost(200);
    }
    @Override
    public void displayInfo()
    {
        String message = String.format("Insurance Type : %s \n Monthly Payment: %.2f", getType(), getMonthlyCost());
        JOptionPane.showMessageDialog(null, message);
    }
}
