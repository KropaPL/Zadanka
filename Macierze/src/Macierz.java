import java.util.Random;

public class Macierz {
    Random rand = new Random();
    int[][] liczby = new int[10][10];

    public void czytajDane(int[][] macierz) {
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                if (i == j) {
                    macierz[i][j] = rand.nextInt(9) + 1;
                } else macierz[i][j] = 0;
            }
        }
    }

    public int przetworzDane(int[][] macierz) {
        int suma = 0;
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                if (i == j) {
                    suma += macierz[i][j];
                }
            }
        }
        return suma;
    }

    public void wyswietlDane(int[][] macierz) {
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                System.out.print(macierz[i][j]);
            }
            System.out.println();
        }
    }
}
