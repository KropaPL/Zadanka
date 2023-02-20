import java.util.Scanner;

public class Tablice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] zbiorA = new int[5];
        int[] zbiorB = new int[5];
        int[] zbiorC = new int[5];

        System.out.println("Wprowadź 5 liczb do zbioru A");
        for (int i = 0; i < zbiorA.length; i++){
            System.out.println((i+1) + ". liczba: ");
            zbiorA[i] = scan.nextInt();
        }
        System.out.println("Wprowadź 5 liczb do zbioru B");
        for (int i = 0; i < zbiorB.length; i++){
            System.out.println((i+1) + ". liczba: ");
            zbiorB[i] = scan.nextInt();
        }
        for(int i = 0; i < zbiorC.length; i++ ){
            zbiorC[i]=zbiorA[i]+zbiorB[i];
        }
        System.out.println("Zbiór C wygląda następującą: ");
        for (int i = 0; i < zbiorC.length; i++ ){
            System.out.println((i+1) + ". liczba " + zbiorC[i]);
        }
    }
}