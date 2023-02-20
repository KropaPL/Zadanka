import java.util.Scanner;

public class odKonca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj napis do odwrócenia: ");
        String name = scan.next();
        System.out.println("Na odwrót: " + naOdwrot(name));
    }
    private static String naOdwrot(String nazwa)
    {
        char[] literki = new char[nazwa.length()];
        String odkoncowki="";
        for (int i = 0; i < nazwa.length(); i++){
            literki [i] = nazwa.charAt(i);
        }
        for (int i = 0; i < nazwa.length(); i++){
            odkoncowki += literki[nazwa.length()-i-1];
    }
        return odkoncowki;
    }
}