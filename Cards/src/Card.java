public class Card {
    private Suits kolor;
    private Ranks figura;

    public Suits getKolor() {
        return kolor;
    }

    public void setKolor(Suits kolor) {
        this.kolor = kolor;
    }

    public Ranks getFigura() {
        return figura;
    }

    public void setFigura(Ranks figura) {
        this.figura = figura;
    }

    public String GetDescription() {

        char[] arrayFigura = figura.toString().toLowerCase().toCharArray();

        arrayFigura[0] = Character.toUpperCase(arrayFigura[0]);

        String figuraString = new String( arrayFigura );

        char[] arrayKolor = kolor.toString().toLowerCase().toCharArray();

        arrayKolor[0] = Character.toUpperCase(arrayKolor[0]);

        String kolorString = new String( arrayKolor );

        return figuraString + " - " +  kolorString;

    }
}
