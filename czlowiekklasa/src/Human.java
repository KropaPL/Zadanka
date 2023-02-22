import java.util.Scanner;

public class Human {
    Scanner scan = new Scanner(System.in);
    int wiek;
    int wzrost;
    int waga;
    String imię;
    String płeć;

    public String getImie(String nazwa) {
        System.out.println("Podaj swoje imię: ");
        nazwa = scan.next();
        return nazwa;
    }

    public int getWaga(int liczba) {
        System.out.println("Podaj swoją wage: ");
        liczba = scan.nextInt();
        return liczba;
    }

    public int getWzrost(int centymetry) {
        System.out.println("Podaj swój wzrost: ");
        centymetry = scan.nextInt();
        return centymetry;
    }

    public int getWiek(int lata) {
        System.out.println("Podaj swój wiek: ");
        lata = scan.nextInt();
        return lata;
    }

    public String czyChłop(String chlop) {
        byte odp;
        System.out.println("Jesteś mężczyzną?:");
        System.out.println("1 = Tak");
        System.out.println("2 = Nie");

        odp = scan.nextByte();

        switch (odp) {
            case 1:
                chlop = "Chłop";
                break;
            case 2:
                chlop = "Baba";
                break;
            default:
                System.out.println("Podałeś złą odpowiedź ;(");
                chlop = "nwm";
        }
        return chlop;
    }

}