import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a, b, c;

        System.out.println("Podaj wspolczynniki trojmianu kwadratowego:");
        System.out.print("a = ");
        a = scan.nextDouble();
        System.out.print("b = ");
        b = scan.nextDouble();
        System.out.print("c = ");
        c = scan.nextDouble();

        Trojmian funkcja = new Trojmian(a, b, c);

        funkcja.przetworzWynik();
        funkcja.wyswietlWynik();
    }
}