package TempConv;

import java.util.Scanner;

import static TempConv.TemperatureConverter.celciusToFahrenheit;
import static TempConv.TemperatureConverter.fahrenheitToCelcius;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Temperature in Celcius: ");
        double celcius = scanner.nextInt();
        System.out.print("\nEnter a Temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextInt();

        double convertF = celciusToFahrenheit(celcius);
        double convertC = fahrenheitToCelcius(fahrenheit);
        System.out.printf(" %.2f Degrees celcius to fahrenheit: %.2f", celcius, convertF);
        System.out.printf(" \n%.2f Degrees fahrenheit to celcius: %.2f", fahrenheit, convertC);
    }
}
