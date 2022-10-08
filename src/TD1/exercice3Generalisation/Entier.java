package TD1.exercice3Generalisation;

import java.util.Objects;

public class Entier implements Sommable<Entier> {

    private Integer valeur;

    public Entier(Integer val) {
        this.valeur = val;
    }

    public Integer getVal() {
        return valeur;
    }

    @Override
    public Entier sommer(Entier val) {
        return new Entier(this.valeur+ val.getVal());
    }

    @Override
    public String toString() {
        return "type Entier : [" + "La valeur =" + valeur + ']';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Entier entier = (Entier) obj;
        return Objects.equals(valeur, entier.valeur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valeur);
    }

    public int compareTo(Entier obj) {
        return this.valeur.compareTo(obj.valeur);
    }
}
