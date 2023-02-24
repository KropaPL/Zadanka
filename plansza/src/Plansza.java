import java.util.Scanner;

public class Plansza {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("jak duże chcesz pole do gry? ");
        int wielkosc = scan.nextInt();

        String repeated = " ---  ".repeat(wielkosc);
        String repeated2 = "|  ".repeat((2*wielkosc));

        for (int i = 0; i < wielkosc; i++) {
            System.out.println(repeated);
            System.out.println(repeated2);
        }
        System.out.println(repeated);
    }
}
