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


        String figuraStr;
        String kolorStr;

        figuraStr = figura.toString();
        kolorStr = kolor.toString();

        figuraStr = figuraStr.substring(0,1).toUpperCase() + figuraStr.substring(1,figuraStr.length()).toLowerCase();
        kolorStr  = kolorStr.substring(0,1).toUpperCase() + kolorStr.substring(1, kolorStr.length()).toLowerCase();

        return  figuraStr + " - " + kolorStr;
    }
}
