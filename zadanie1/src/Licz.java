public class Licz {
    Licz(int liczb){
        wartosc = liczb;
    }

    private int wartosc;

    public void Dodaj(int liczba){
        wartosc+=liczba;
    }
    public void Odejmij(int liczba){
        wartosc-=liczba;
    }
    public void Pokaz(){
        System.out.println(wartosc);
    }

}