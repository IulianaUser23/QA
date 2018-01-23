/**
 * Created by User on 17.01.2018.
 */
public class Candle {
    private String color;
    private String shape;
    private String smell;
    private int numberOfCandles;
    private boolean newCandle;

    public String getColor() {    return color;  }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public int getNumberOfCandles() {
        return numberOfCandles;
    }

    public void setNumberOfCandles(int numberOfCandles) {
        this.numberOfCandles = numberOfCandles;
    }

    public boolean isNewCandle() {
        return newCandle;
    }

    public void setNewCandle(boolean newCandle) {
        this.newCandle = newCandle;
    }
}
