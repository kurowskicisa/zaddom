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


        return figura + " - " +  kolor;

    }
}
