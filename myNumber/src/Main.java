import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double innaLiczba;

        System.out.println("Podaj liczbę na której chcesz wykonywać operacje: ");
        innaLiczba = scan.nextInt();

        mojaLiczba coś = new mojaLiczba(innaLiczba);

        System.out.println("Czy parzysta? " + coś.isEven());
        System.out.println("Czy nieparzysta? " + coś.isOdd());
        System.out.println("pierwiastek tej liczby:" + coś.pierwiastek());

        System.out.println("Podaj swoją liczbę: ");
        innaLiczba = scan.nextInt();

        mojaLiczba liczbaUżytkownika = new mojaLiczba(innaLiczba);

        System.out.println("Liczba podniesiona do potęgi " + innaLiczba + " :" + coś.potega(liczbaUżytkownika));
        System.out.println("Liczba odjęta użytkownika: " + coś.substract(liczbaUżytkownika));
        System.out.println("Liczba dodana użytkownika: " + coś.add(liczbaUżytkownika));

    }
}