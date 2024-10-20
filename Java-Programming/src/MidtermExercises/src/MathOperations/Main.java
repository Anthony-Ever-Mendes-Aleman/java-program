package MathOperations;
import MathOperations.MathOperations.*;
public class Main
{
    public static void main(String[] args)
    {
        MathOperations m = new MathOperations();
        System.out.println("The addition of two integers: " + m.add(1,2));
        System.out.println("The addition of two doubles: " + m.add(2.3, 4.6));
        System.out.println("The multiplication of two integers: " + m.multiply(2,2));
        System.out.println("The multiplication of two doubles: " + m.multiply(2.3, 4.6));
    }
}
