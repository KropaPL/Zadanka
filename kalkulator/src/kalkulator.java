import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double liczba1, liczba2;
        int wybor;
        System.out.println("Podaj 1 liczbę: ");
        liczba1 = scanner.nextInt();
        System.out.println("Podaj 2 liczbę: ");
        liczba2 = scanner.nextInt();
        System.out.println("Co chcesz wykonać za działanie?");
        System.out.println("1.Dodawanie");
        System.out.println("2.Odejmowanie");
        System.out.println("3.Mnożenie");
        System.out.println("4.Dzielenie");
        wybor = scanner.nextInt();

        if (wybor==1){
            System.out.println(liczba1+liczba2);
        } else if (wybor==2){
            System.out.println(liczba1-liczba2);
        } else if (wybor==3){
            System.out.println(liczba1*liczba2);
        } else if (wybor==4){
            System.out.println(liczba1/liczba2);
        } else {
            System.out.println("nie ma takiego działania w menu");
        }
    }

}