package converter.app;

public class TemperatureConvertor {
    public static void main(String[] args) {
        System.out.println("Application for conversion of temperature");
        double fahrenheitTemp = 27.0;
        System.out.printf("%.2f Fahrenheits are equals to %.2f Celsius\n", fahrenheitTemp,
                fromFahrenheitToCelsius(fahrenheitTemp));
        double celsiusTemp = 27.0;
        System.out.printf("%.2f Celsius are equals to %.2f Fahrenheits\n", celsiusTemp,
                fromCelsiusToFahrenheit(celsiusTemp));
    }
    public static double fromFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit-32) / 1.8;
    }
    public static double fromCelsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
}
