package app;

public class ConverterKMs {
    private static final double CONV_KM = 1.60934;
    public static void main() {
            System.out.println("Converter App.");
            System.out.println("App for distance converting");
            double kms = 5;
            double miles = ConvKmsToMiles(kms);

            System.out.println("Result is " + miles + " miles");

        }

        private static double ConvKmsToMiles(double kms) {
            return kms * CONV_KM;
        }
}
