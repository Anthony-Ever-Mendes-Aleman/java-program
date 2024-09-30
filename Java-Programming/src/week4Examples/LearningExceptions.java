package week4Examples;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LearningExceptions {
    public static void main(String[] args) {
        try
        {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            double numOne = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double numTwo = scanner.nextDouble();

            double sum = numOne + numTwo;
            System.out.println("The sum of the two numbers is: " + sum);

            scanner.close();
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid input: PUT A MF REAL ASS NUMBER DUMBASS");
        }catch (InputMismatchException ime)
        {
            System.out.println("Invalid input: " + ime.getMessage());
        }
        catch(IllegalArgumentException ile){
            System.out.println("Invalid input: " + ile.getMessage());
        }
        catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        }

    }
}
