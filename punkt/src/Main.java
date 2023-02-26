public class Main {
    public static void main(String[] args) {
        punkt punkcik = new punkt();

        punkcik.zwiekszX();
        punkcik.zwiekszY();
        punkcik.zmienX(5);
        punkcik.zmienY(13);

        punkcik.wyswietl();

        int innawar = punkcik.dajX() + punkcik.dajY();

        System.out.println("inna wartość wynosi: " + innawar);


    }
}