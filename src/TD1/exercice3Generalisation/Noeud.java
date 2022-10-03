package TD1.exercice3Generalisation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Noeud<T extends Sommable> implements Arbre<T>, Sommable<T> {

    public Set<Arbre> son;

    public Noeud(Set<Arbre> son) {
        this.son = son;
    }

    @Override
    public int taille() {
        int t1 = 0;
        for (Arbre a : son) {
            t1 += a.taille();
        }
        return t1;
    }

    @Override
    public boolean contient(T val) {
        boolean t1 = false;
        for (Arbre a : son) {
            if(t1 || a.contient(val)){
                return true;
            };
        }
        return t1;
    }

    @Override
    public Set<T> valeurs() {
        Set<T> t1 = new HashSet<>();
        for (Arbre a : son) {
            t1.addAll(a.valeurs());
        }
        return t1;
    }

    @Override
    public T somme() {
        /*Iterator<Arbre> element1;
        T t1 = element1.next().somme();
        Arbre tree;
        while (element1.hasNext()) {
            tree = element1.next();
            t1 = t1.sommer(tree.somme());
        }
        return t1;*/
        return null;
    }

    @Override
    public T sommer(T val) {
        return null;
    }
}
