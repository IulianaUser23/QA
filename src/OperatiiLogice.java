/**
 * Created by User on 24.01.2018.
 */
public class OperatiiLogice {

    public int compareNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else return secondNumber;
    }

    public String containText(String text) {
        if (text.equals("FastTrack")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public int equalsTo(int number) {
        if (number >= 2 && number <= 8) {
            return number;
        } else {
            return 0;
        }
    }

    public String numberAndText(int myNumber, String myText) {
        if (myText.equals("FastTrack") && myNumber <= 3) {
            return myText + myNumber;
        } else if (!myText.equals("FastTrack") && myNumber >= 4) {
            return myNumber + myText;
        }return "Not Valid";
    }
}