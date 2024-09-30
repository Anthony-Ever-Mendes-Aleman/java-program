import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        boolean isvalid = false;
        while (!isvalid) {
            String input = JOptionPane.showInputDialog(null, "Choose a number between 3-27: ");

            if (input == null || input.isEmpty() || Integer.parseInt(input) > 27 || Integer.parseInt(input) < 3 ) {
                JOptionPane.showMessageDialog(null, "PLEASE MAKE SURE TO ENTER A VALID NUMBER BETWEEN 3-27", "WARNING", JOptionPane.WARNING_MESSAGE);
                continue;
            }else {
                int i = 0;

                while (i < 5){
                    int[] winningArray = Lotto.ReturnArray();
                    int winningNum = winningArray[0] + winningArray[1] + winningArray[2];
                    if (winningNum == Integer.parseInt(input)) {
                        JOptionPane.showMessageDialog(null, "YOU WIN!", "CONGRATULATIONS", JOptionPane.INFORMATION_MESSAGE);
                        isvalid = true;
                        break;
                    } else if (i == 4){
                        JOptionPane.showMessageDialog(null, "YOU LOST!", "LOSER", JOptionPane.ERROR_MESSAGE);
                        isvalid = true;
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "DID NOT WIN... TRYING AGAIN", "NOT A WINNER", JOptionPane.ERROR_MESSAGE);
                        i++;
                    }


                }
            }
        }

    }
}