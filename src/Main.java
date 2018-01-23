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


        Book conversatiiLaCatedrala = new Book();
        conversatiiLaCatedrala.setAuthor("Vargas Llosa");
        System.out.println("au mai ramas de citit:" + conversatiiLaCatedrala.numberOfPagesLeft(603,47));

        Pen pixulFermecat = new Pen();
        pixulFermecat.setColorOfInk("red");
        System.out.println("Pentru a scrie numarul de pagini dorit aveti nevoie de " + pixulFermecat.scrie(25)
                + " pixuri");

        Candle lumanare = new Candle();



       /* Dog rex = new Dog();
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