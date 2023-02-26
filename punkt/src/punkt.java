public class punkt {
    private int x;
    private int y;

    void zwiekszX(){
        x++;
    }
    void zwiekszY(){
        y++;
    }
    void zmienX(int a){
        x+=a;
    }
    void zmienY(int a){
        y+=a;
    }
    int dajX (){
    return x;
    }
    int dajY(){
        return y;
    }

    void wyswietl(){
        System.out.println("X: " + x + ", Y: " + y);
    }

}
