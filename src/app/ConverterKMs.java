package app;

public class ConverterKMs {

    private static final double CONV_KM = 1.60934;

    public static void main(String[] args) {
        System.out.println("Converter App.");
        System.out.println("App for distance converting");

        double kms = 5;
        double mil = 80;

        double miles = convKmsToMiles(kms);
        double kilometres = convMilesToKms(mil);

        System.out.println("Result is %.2f miles and %.2f kms".formatted(miles, kilometres));
    }

    private static double convKmsToMiles(double kms) {
        return kms / CONV_KM;
    }

    private static double convMilesToKms(double mil) {
        return mil * CONV_KM;
    }
}
