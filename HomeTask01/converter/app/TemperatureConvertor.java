package converter.app;

public class TemperatureConvertor {
    public static void main(String[] args) {
        System.out.println("Application for conversion of temperature");
        double fahrenheitTemp = 27.0;
        System.out.printf("%.2f Fahrenheits are equals to %.2f Celsius\n", fahrenheitTemp,
                fromFahrenheitToCelsius(fahrenheitTemp));
    }
    public static double fromFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit-32) / 1.8;
    }
}
