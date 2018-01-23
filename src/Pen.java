/**
 * Created by User on 17.01.2018.
 */
public class Pen {
    private String colorOfPen;
    private int numberOfPens;
    private String logoOfThePen;
    private String colorOfInk;
    private double sizeOfPen;
    private int termenDeValabilitate = 10;
    private int nrDePagini;

    public double scrie (double nrDePagini){
        double x = nrDePagini / termenDeValabilitate;
        return x;
    }

    public int getNrDePagini() {
        return nrDePagini;
    }

    public void setNrDePagini(int nrDePagini) {
        this.nrDePagini = nrDePagini;
    }




    public String getColorOfPen() { return colorOfPen; }

    public void setColorOfPen(String colorOfPen) {
        this.colorOfPen = colorOfPen;
    }

    public int getNumberOfPens() {
        return numberOfPens;
    }

    public void setNumberOfPens(int numberOfPens) {
        this.numberOfPens = numberOfPens;
    }

    public String getLogoOfThePen() {
        return logoOfThePen;
    }

    public void setLogoOfThePen(String logoOfThePen) {
        this.logoOfThePen = logoOfThePen;
    }

    public String getColorOfInk() {
        return colorOfInk;
    }

    public void setColorOfInk(String colorOfInk) {
        this.colorOfInk = colorOfInk;
    }

    public double getSizeOfPen() {
        return sizeOfPen;
    }

    public void setSizeOfPen(double sizeOfPen) {
        this.sizeOfPen = sizeOfPen;
    }


}
