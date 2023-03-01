public class Main {
    public static void main(String[] args) {
        Macierz uklad = new Macierz();
        uklad.czytajDane(uklad.liczby);
        uklad.wyswietlDane(uklad.liczby);
        System.out.println("Suma liczb na przekątnej wynosi: " + uklad.przetworzDane(uklad.liczby));
    }
}