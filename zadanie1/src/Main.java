import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź liczbę");
        int cyfra = scan.nextInt();
        Licz liczba = new Licz(cyfra);

        liczba.Dodaj(5);
        liczba.Odejmij(1);
        liczba.Pokaz();
    }
}