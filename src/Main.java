import java.util.Scanner;

public class Main {

    //public static int primulNumar = 6;
    //private static int alDoileaNumar = 7;

    public static void main(String[] args) {

       Calculator calculator = new Calculator();
       // calculator.adunare(3,4);
        System.out.println("Rezultatul adunarii este: " + calculator.adunare(3,4));
        System.out.println("Rezultatul scaderii este: " + calculator.scadere(7,4));
        System.out.println("Rezultatul inmultirii este: " + calculator.inmultire(7,4));
        System.out.println("Rezultatul impartirii este: " + calculator.impartire(7,4));
        System.out.println("Restul impartirii este: " + calculator.modulo(7,4));
        System.out.println("Ridicare la putere este: " + calculator.ridicareLaPutere(3,3));
        System.out.println("Radicalul este: " + calculator.radical(16));


        //Given two numbers, see which one is the greatest and print it

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first = scan.nextInt();
        System.out.println("Enter second number: ");
        int second = scan.nextInt();

        OperatiiLogice op = new OperatiiLogice();
        System.out.println("Maximum number is: " + op.compareNumbers(first,second));

        //Given a text input, if it is “FastTrack”, then print “Learning text comparison”. If not, print
//“Got to try some more”

        String text = scan.next();
        System.out.println(op.containText(text));







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

}