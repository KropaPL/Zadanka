import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Podaj który wyraz ciagu fibonacciego chcesz: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Twój " + n + ". wyraz wynosi: ");
        System.out.println(ciag(n));
    }

    public static long ciag (int x){
        if (x < 3){
            return 1;
        }
        return  ciag(x - 2) + ciag(x - 1);
    }

}