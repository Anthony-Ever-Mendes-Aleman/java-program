package Lab3;

import javax.swing.*;
import java.awt.image.LookupOp;

public class Main
{
    public static void main(String[] args)
    {
        String[] options = {"Life Insurance", "Health Option", "Cancel"};


        Health healthInsurance = new Health();
        Life lifeInsurance = new Life();
        int option;
        do
        {
        option = JOptionPane.showOptionDialog(null, "Choose type of Insurance for Monthly Payment: ", "Insurance", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0] );

        switch (option)
        {
          case 0:
              lifeInsurance.setInsurance();
              lifeInsurance.displayInfo();
              continue;
              case 1:
                  healthInsurance.setInsurance();
                  healthInsurance.displayInfo();
                  continue;
                  case 2:
                      JOptionPane.showMessageDialog(null, "You have successfully cancelled the procedure ");
                      break;
        }
        }while (option != 2);
    }
}