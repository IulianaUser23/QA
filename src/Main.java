import java.util.Scanner;

public class Main {

    //public static int primulNumar = 6;
    //private static int alDoileaNumar = 7;

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        // calculator.adunare(3,4);
        System.out.println("Rezultatul adunarii este: " + calculator.adunare(3, 4));
        System.out.println("Rezultatul scaderii este: " + calculator.scadere(7, 4));
        System.out.println("Rezultatul inmultirii este: " + calculator.inmultire(7, 4));
        System.out.println("Rezultatul impartirii este: " + calculator.impartire(7, 4));
        System.out.println("Restul impartirii este: " + calculator.modulo(7, 4));
        System.out.println("Ridicare la putere este: " + calculator.ridicareLaPutere(3, 3));
        System.out.println("Radicalul este: " + calculator.radical(16));


        //Given two numbers, see which one is the greatest and print it

        Scanner scan = new Scanner(System.in);

        /*System.out.println("Enter first number: ");
        int first = scan.nextInt();
        System.out.println("Enter second number: ");
        int second = scan.nextInt();

        OperatiiLogice op = new OperatiiLogice();
        System.out.println("Maximum number is: " + op.compareNumbers(first, second));
*/
//Given a text input, if it is “FastTrack”, then print “Learning text comparison”. If not, print
// “Got to try some more”

        /*String text = scan.next();
        System.out.println(op.containText(text));*/

//Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the number

       /* System.out.println("Enter a number: ");
        int number = scan.nextInt();

        if (number >= 2 && number <= 8) {
            System.out.println("Number is:" + number);
        } else {
            System.out.println("Number is out of range");
        }*/

        /*Given a text input and a number input, if the text is equal to “FastTrack” AND the number is equal to or lower
than 3, print the text and the number. If the text is not “FastTrack” AND     the number is equal to or higher
than 4, print the number and the text, in this order.*/

        /*System.out.println("Enter a word: ");
        String myText = scan.next();
        System.out.println("Enter a number: ");
        int myNumber =scan.nextInt();
        if (myText.equals("FastTrack")&& myNumber <= 3) {
            System.out.println("The text is: " + myText + " and the nummer is: " + myNumber);
        }else if (!myText.equals("FastTrack") && myNumber >= 4){
            System.out.println("The number is: " + myNumber +"and the text is:" + myText);
        }*/
/*Given a number input, if it is higher than 8 OR equal to 6, print “The amount of snow this winter was(cm):” and
the given number. Else print “The forecast snow is(cm):”*/

        /*System.out.println("Enter a number: ");
        int meteoNumber = scan.nextInt();
        if (meteoNumber > 8 || meteoNumber == 6){
            System.out.println("The amount of snow this winter was(cm): " + meteoNumber );
        } else {
            System.out.println("The forecast snow is(cm): " + meteoNumber);
        }*/
/* Given a number input, if the number is greater than 3 but not equal to 4, print “The number is greater than 3 and
not equal to 4”. Else if the number is equal to 4 print ”The number is equal to 4”. Else if the number is
lower than 3 print “The number is lower than 3”*/

    }





/*
        Book carte = new Book();
        carte.setAuthor("Vargas Llosa");
        System.out.println("Au mai ramas de citit:" + carte.numberOfPagesLeft(603,47));

        Pen pixulFermecat = new Pen();
        pixulFermecat.setColorOfInk("red");
        System.out.println("Pentru a scrie numarul de pagini dorit aveti nevoie de " + pixulFermecat.scrie(25)
                + " pixuri");

        Candle lumanare = new Candle();*/

    //  bark();  cu mostenire

    /*  Dog rex = new Dog();
        rex.setAge(4);
        rex.setAlive(true);
        rex.setWheight(59.4);
        rex.setColor("brown");
        rex.setBreed("ciobanesc");

        System.out.println(rex.getAge());
        System.out.println(rex.getWheight());
        rex.bark();
        rex.eat();

        Dog ursu = new Dog();
        ursu.setColor("negru");
        ursu.setBreed("lup");
        ursu.setWheight(30.5);
        ursu.setAge(2);
        System.out.println(ursu.getAge());
        System.out.println(ursu.getWheight());*/

       /* String myString = "Valoare de string";
        System.out.println(myString);

        char singleCharacter = 'a';
        System.out.println(singleCharacter);

        float myFloat = 4.8f;
        double myDouble = 3.6;
        //System.out.println(myString + primulNumar + alDoileaNumar + myDouble + myFloat);

        adunare(3,4);
        scadere();
        inmultire();
        impartire();*/
}

