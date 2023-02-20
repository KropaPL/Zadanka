import java.util.Scanner;

public class Sortowanie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź ile chcesz liczb do posortowania: ");
        int iloscLiczb = scan.nextInt();
        int[] zbior = new int[iloscLiczb];

        System.out.println("Wprowadź liczby: ");
        for (int i = 0; i < zbior.length; i++){
            zbior[i] = scan.nextInt();
        }

        sortuj(zbior);

        System.out.println("Posortowane liczby:");
        for (int i = 0; i < zbior.length; i++){
            System.out.println(zbior[i]);
        }
    }

    private static void sortuj(int[] tablica) {
        boolean zamieniono;
        do {
            zamieniono = false;
            for (int i = 0; i < tablica.length - 1; i++) {
                if (tablica[i] > tablica[i + 1]) {
                    int tymczas = tablica[i + 1];
                    tablica[i + 1] = tablica[i];
                    tablica[i] = tymczas;
                    zamieniono = true;
                }
            }
        } while (zamieniono);
    }
}
