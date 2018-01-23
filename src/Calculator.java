/**
 * Created by User on 17.01.2018.
 */

public class Calculator {


    public int adunare(int x, int y) {
        return x + y;
    }

    public int scadere(int x, int y) {
        return x - y;
    }

    public int inmultire(int x, int y) {
        return x * y;
    }

    public int impartire(int x, int y) {
        return x / y;
    }

    public int modulo(int x, int y) {
        return x % y;
    }

    public int ridicareLaPutere(int x, int y) {
        int a=1;
        for (int i=1; i<=y; i++){
            a=a*x;
        }
        return a;
    }

    public double radical(double x) {
        x = Math.sqrt(x);
        return x;
    }

}
