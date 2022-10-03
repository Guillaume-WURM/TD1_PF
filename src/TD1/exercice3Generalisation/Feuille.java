package TD1.exercice3Generalisation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Feuille<T extends Sommable> implements Arbre<T>, Sommable<T>{

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
        return null;
    }

    @Override
    public T sommer(T val) {
        return null;
    }
}
