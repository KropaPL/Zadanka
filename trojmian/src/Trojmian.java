import static java.lang.Math.sqrt;

public class Trojmian {
    Trojmian(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double a, b, c;
    double delta, liczbaPierwiastkow, x1, x2;

    public void przetworzWynik() {
        delta = b * b - (4 * a * c);
        if (delta > 0) {
            liczbaPierwiastkow = 2;
        } else if (delta < 0) {
            liczbaPierwiastkow = 0;
        } else {
            liczbaPierwiastkow = 1;
        }
        switch ((int) liczbaPierwiastkow) {
            case 2:
                x1 = (-b + sqrt(delta))/2*a;
                x2 = (-b - sqrt(delta))/2*a;
                break;
            case 1:
                x1 = -b/2*a;
                break;
            case 0:
                System.out.println("Brak pierwiastków do obliczenia");
                break;
        }
    }
    public void wyswietlWynik(){
        switch ((int) liczbaPierwiastkow){
            case 2:
                System.out.println("Obliczone pierwiastki to:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
                break;
            case 1:
                System.out.println("Obliczony pierwiastek to:");
                System.out.println("x = " + x1);
                break;
            case 0:
                System.out.println("Nie ma pierwiastkow");
                break;
        }
    }
}
