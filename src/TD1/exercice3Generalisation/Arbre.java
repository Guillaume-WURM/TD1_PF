package TD1.exercice3Generalisation;

import java.util.Set;

public interface Arbre<T extends Sommable> {
    int taille();
    boolean contient(final T val);
    Set<T> valeurs();
    T somme();
}