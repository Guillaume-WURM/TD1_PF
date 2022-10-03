package TD1.exercice3Generalisation;

public class Chaine <T> implements Sommable<Chaine> {
    private  String valeur;
    public Chaine(String valeur) {
        this.valeur = valeur;
    }

    @Override
    public Chaine sommer(Chaine val) {
        return new Chaine(this.valeur + val.valeur);
    }
    public String getValeur() { return valeur; }
}
