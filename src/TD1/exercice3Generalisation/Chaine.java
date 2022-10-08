package TD1.exercice3Generalisation;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Chaine chaine = (Chaine) obj;
        return Objects.equals(valeur, chaine.valeur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valeur);
    }

    public int compareTo(Chaine o) {
        return this.valeur.compareTo(o.valeur);
    }
}
