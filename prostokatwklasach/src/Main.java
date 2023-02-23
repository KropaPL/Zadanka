import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        prostokat figura = new prostokat();

        System.out.println("Witaj! :D");
        System.out.println("Podaj wymiary swojego prostokąta :D");
        System.out.println("Bok a: ");
        figura.bokA = scan.nextDouble();
        System.out.println("Bok b: ");
        figura.bokB = scan.nextDouble();

        System.out.println("Pole wynosi = " + figura.pole(figura.bokA, figura.bokB));
        System.out.println("Obwód wynosi = " + figura.obwod(figura.bokA, figura.bokB));
        System.out.println("Przekątna wynosi = " + figura.przekatna(figura.bokA, figura.bokB));
    }
}