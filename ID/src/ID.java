import java.util.Scanner;

public class ID {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje ID: ");

        int ID= scanner.nextInt();

        String imie = (ID == 1) ? "Szef" : "Pracownik";

        System.out.println("Witaj");

        if (imie.endsWith("f")){
            System.out.println("Szefie");
        } else {
            System.out.println("Pracowniku");
        }
        switch (imie){
            case "Szef":
                System.out.println("Kropko");
                break;
            case "Pracownik":
                System.out.println("Tofiko");
                break;
        }
    }

}