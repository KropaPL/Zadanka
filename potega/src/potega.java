import java.util.Scanner;
import static java.lang.Math.pow;

public class potega {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbe która chcesz podnieść do danej potęgi: ");
        double pod = scan.nextDouble();
        System.out.println("Podaj wykładnik potęgi: ");
        double wyk = scan.nextDouble();

        System.out.println("Otyrzymany wynik to: " + podnoszenie(pod, wyk));
    }

    private static double podnoszenie(double podstawa, double potega) {
        double x;
        x = pow(podstawa, potega);
        return x;
    }
}