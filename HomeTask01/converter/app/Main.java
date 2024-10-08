package converter.app;

public class Main {

    public static final double POUNDS_TO_KGS=0.453592;

    public static void main(String[] args) {
        System.out.println("App for measures converting.");
        System.out.println("Version 1.0");
        double p=5.0;
        double kg=pounds_to_kilos(p);
        System.out.printf("%.2f pounds are equals to %.2f kilos%n", p, kg);
        kg=12;
        p=kilos_to_pounds(kg);
        System.out.printf("%.2f kilos are equals to %.2f pounds%n", kg, p);
    }
    public static double pounds_to_kilos(double pounds){
        return pounds*POUNDS_TO_KGS;
    }
    public static double kilos_to_pounds(double kilos){
        return kilos/POUNDS_TO_KGS;
    }
}
