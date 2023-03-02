import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Krolik krolik1 = new Krolik("Biała");
        Krolik krolik2 = new Krolik("Kropa");
        Krolik krolik3 = new Krolik("Ciapak");
        Krolik krolik4 = new Krolik("Tofinek");

        ArrayList lista = new ArrayList();
        ArrayList<Krolik> listag = new ArrayList<Krolik>(); // lista generyczna nie potrzeba rzutowania na klase

        lista.add(krolik1);
        lista.add(krolik2);
        lista.add(krolik3);
        lista.add(krolik4);

        listag.add(krolik1);
        listag.add(krolik2);
        listag.add(krolik3);
        listag.add(krolik4);

        System.out.println("------------------");
        for (Object k : lista){
            System.out.println(((Krolik)k).imie);
        }
        System.out.println("------------------");

        System.out.println(((Krolik)lista.get(0)).imie);
        System.out.println(lista.size());
        System.out.println(lista.contains(krolik2));
        lista.remove(krolik4);
        lista.remove(0);
        System.out.println("------------------");
        for (Object k : lista){ // Z typem generycznym zamiast object wpisać nazwe klasy
            System.out.println(((Krolik)k).imie);
        }
        System.out.println("------------------");
    }
}