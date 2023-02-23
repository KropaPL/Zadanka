import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class prostokat {
    double bokA;
    double bokB;

    public double pole(double boczek1, double boczek2) {
        double pole = boczek1 * boczek2;
        return pole;
    }

    public double obwod(double bok1, double bok2) {
        double obwód = 2*bok1 + 2*bok2;
        return obwód;
    }

    public double przekatna(double bokp, double bokq){
        double przekątna = sqrt(pow(bokp,2)+pow(bokq,2));
        return przekątna;
    }
}
