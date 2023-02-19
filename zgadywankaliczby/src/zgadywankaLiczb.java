import java.util.Random;
import java.util.Scanner;

public class zgadywankaLiczb {
    public static void main(String[] args) {
        int i = 0, odp, los;
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        los = rnd.nextInt(5)+1;

        System.out.println("Zgadywanka Liczb :D");
        System.out.println("od 1 do 5");
        do {

            System.out.println("Podaj liczbę: ");
            odp = scan.nextInt();

            i++;

            if (odp < los) {
                System.out.println("Liczbę do odgadnięcia jest większa");
            } else if (odp > los) {
                System.out.println("Liczbę do odgadnięcia jest mniejsza");
            }

        } while (odp != los);
        System.out.println("Odgadłeś liczbę za " + i + " razem!");

    }
}