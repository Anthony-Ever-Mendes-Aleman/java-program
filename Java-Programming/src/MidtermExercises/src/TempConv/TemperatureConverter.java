package TempConv;

public class TemperatureConverter {
    static double celciusToFahrenheit(double celcius)
    {
        return (celcius * 9/5) + 32;
    }

    static double fahrenheitToCelcius(double fahrenheit){
        return (fahrenheit - 32) * 5/9 ;
    }
}
