package converter.app;

public class Main {

    public static final double POUNDS_TO_KGS=0.453592;

    public static void main(String[] args) {
        System.out.println("App for measures converting.");
        double p=5.0;
        double kg=pounds_to_kilos(p);
        System.out.printf("%.2f pounds are equals to %.2f kilos", p, kg);
    }
    public static double pounds_to_kilos(double pounds){
        return pounds*POUNDS_TO_KGS;
    }
}
