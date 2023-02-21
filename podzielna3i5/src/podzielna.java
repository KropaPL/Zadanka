import java.util.Scanner;

public class podzielna {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź liczbe do sprawdzenia czy jest podzielna naraz przez 3 i 5");
        int liczba = scan.nextInt();
        System.out.println(podzielnosc(liczba));
        System.out.println(podzielnoscprzez15(liczba));
    }

    private static boolean podzielnosc(int x) {
        boolean test = false;
        if (x % 3 == 0 && x % 5 == 0) {
            test = true;
        }
        return test;
    }

    private static boolean podzielnoscprzez15(int x) {
        boolean test = false;
        if (x % 15 == 0) {
            test = true;
        }
        return test;
    }
}