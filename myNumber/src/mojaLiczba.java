import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class mojaLiczba {
    public mojaLiczba(double liczba) {
        this.liczba = liczba;
    }

    double liczba;

    public boolean isOdd() {
        return !(liczba % 2 == 0);
    }

    public boolean isEven() {
        return liczba % 2 == 0;
    }

    public double pierwiastek() {
        return sqrt(liczba);
    }

    public double potega(mojaLiczba innaWartosc) {
        return new mojaLiczba(pow(liczba, innaWartosc.liczba)).liczba;
    }

    public double add(mojaLiczba innaWartosc) {
        return new mojaLiczba(liczba + innaWartosc.liczba).liczba;
    }

    public double substract(mojaLiczba innaWartosc) {
        return new mojaLiczba(liczba - innaWartosc.liczba).liczba;
    }

}
