import java.util.Random;
import java.util.Scanner;

public class Liczby {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("How many numbers do you want to draw? ");

        int n = scan.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = rnd.nextInt(51);
        }

        System.out.println("Największa parzysta: " + greatestEven(numbers));
        System.out.println("Największa nieparzysta: " + greatestOdd(numbers));

    }

    public static int greatestEven(int[] number) {
        int greatest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0 && number[i] > greatest) {
                greatest = number[i];
            }
        }
        if (greatest == Integer.MIN_VALUE) return 0;
        return greatest;
    }
    public static int greatestOdd(int[] number) {
        int greatest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 1 && number[i] > greatest) {
                greatest = number[i];
            }
        }
        if (greatest == Integer.MIN_VALUE) return 0;
        return greatest;
    }
}
