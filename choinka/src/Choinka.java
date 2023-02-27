import java.util.Scanner;

public class Choinka {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj wysokość choinki: ");
        int wysokosc = scan.nextInt();

        choinka(wysokosc);
    }

    public static void choinka(int wys) {
        for (int i = 0; i < wys; i++) {
            for (int j = 0; j < wys - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}