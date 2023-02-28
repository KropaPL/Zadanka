import java.util.Scanner;

import static java.lang.Math.pow;

public class Szesciany {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Suma sześcianów :D");
        System.out.println("Podaj n: ");
        int n = scan.nextInt();

        System.out.println("Suma sześcianów wynosi: " + sumaSzescianow(n));
    }

    public static int sumaSzescianow(int a) {
        int suma = 0;
        for (int i = 0; i <= a; i++) {
            suma += pow(i, 3);
        }
        return suma;
    }
}