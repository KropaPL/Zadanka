public class Main {
    public static void main(String[] args) {
        Human ja = new Human();

        ja.płeć = ja.czyChłop(ja.płeć);
        ja.imię = ja.getImie(ja.imię);
        ja.waga = ja.getWaga(ja.waga);
        ja.wiek = ja.getWiek(ja.wiek);
        ja.wzrost = ja.getWzrost(ja.wzrost);

        System.out.println("To ty! :D");

        System.out.println(ja.płeć);
        System.out.println(ja.imię);
        System.out.println(ja.waga);
        System.out.println(ja.wzrost);
        System.out.println(ja.wiek);

    }
}