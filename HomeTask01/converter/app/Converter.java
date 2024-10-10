/**
 * Application for conversion of miles into kilometres and visa-versa.
 */
package converter.app;

public class Converter {
    public static double KM_PER_MILE=1.60934;
    public static void main(String[] args) {
        System.out.printf("%.2f miles are equal to %.2f kilometres\n", Double.parseDouble(args[0]),
                Double.parseDouble(args[0]) * KM_PER_MILE);
    }
}
