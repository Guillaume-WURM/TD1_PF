package TD1.exercice3Generalisation;

public class Chaine implements Sommable<Chaine> {
    private  String valeur;
    public Chaine(String valeur) {
        this.valeur = valeur;
    }

    @Override
    public Chaine sommer(Chaine val) {
        return new Chaine(this.valeur + val.valeur);
    }
    public String getValeur() { return valeur; }

    @Override
    public String toString() {
        return "type String : [" + "La valeur est =" + valeur + ']';
    }
}
