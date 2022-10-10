package TD1.exercice3Generalisation;


import java.util.HashSet;
import java.util.Set;

public class Feuille<T extends Sommable<T> & Comparable<T>> implements Arbre<T>{

    private T valeur;

    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(final T val) {
        return this.valeur.equals(val);
    }

    @Override
    public Set<T> valeurs() {
        Set<T> set = new HashSet<>();
        set.add(this.valeur);
        return set;
    }

    @Override
    public T somme() {
        return this.valeur;
    }

    @Override
    public String toString() {
        return "feuille : [" + "La feuille est =" + valeur + ']';
    }

    @Override
    public T min() {
        return this.valeur;
    }

    @Override
    public T max() {
        return this.valeur;
    }

    @Override
    public boolean estTrie() {
        return true;
    }
}
