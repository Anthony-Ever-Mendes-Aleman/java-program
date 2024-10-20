package calculatorwithstatic;

import static calculatorwithstatic.Calculator.*;

public class Main {
    public static void main(String[] args){
        int sadd = add(1,1);
        int ssub = subtract(2,1);
        int smultiply = multiply(2,1);
        int sdivide = divide(2,1);

        System.out.println("Static additon: " + sadd);
        System.out.println("Static subtraction: " + ssub);
        System.out.println("Static multiplication: " + smultiply);
        System.out.println("Static division: " + sdivide);
    }
}
