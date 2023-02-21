import java.util.Scanner;

public class trojkat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Test na istnienie trójkąta");
        double[] boki = new double[3];
        for (int i = 0; i < boki.length; i++){
            System.out.println("Wprowadź " + (i+1) + ". bok: ");
            boki [i] = scan.nextDouble();
        }
        System.out.println("Wynik testu to: " + trojkat(boki[0], boki[1], boki[2]));
    }

    private static boolean trojkat(double a, double b, double c) {
        boolean test = false;
        if (a > b && a > c && (a < b + c)) {
            test = true;
        } else if (b > a && b > c && (b < a + c)) {
            test = true;
        } else if (c > a && c > b && (c < a + b)) {
            test = true;
        }
        return test;
    }
}
