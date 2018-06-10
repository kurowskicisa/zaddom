
import java.util.Scanner;

public class Cards {


    public static void main (String [] args){

        String mojaKarta;

        Card karta = new Card(  );

        karta.setFigura(Ranks.ACE);
        karta.setKolor(Suits.DIAMONDS);
        mojaKarta = karta.GetDescription();

        System.out.println( mojaKarta );
        karta.setFigura(Ranks.KING);
		mojaKarta = karta.GetDescription();
        System.out.println( mojaKarta );

        Scanner readKolor = new Scanner(System.in);
        Scanner readFigua = new Scanner(System.in);



////////
        System.out.println("Podaj figura ( ACE lub KING lub QUEEN lub JACK): ");
// do
        Ranks inputRanks = Ranks.valueOf(readFigua.next().toUpperCase());
// whie brak błędu

        karta.setFigura(inputRanks);
////////

        System.out.println("Podaj kolor ( CLUBS lub DIAMONDS lub HEARTS lub SPADES): ");
// do
        Suits inputSuits = Suits.valueOf(readKolor.next().toUpperCase());
// while brak błędu

        karta.setKolor(inputSuits);
////////

        mojaKarta = karta.GetDescription();

        System.out.println( mojaKarta );

    }
}

