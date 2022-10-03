package TD1.exercice3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud implements Arbre {
    //exercice 3 question 2

    private final List<Arbre> son;

    public Noeud(List<Arbre> fils) {
        this.son = fils;
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
    public boolean contient(Integer val) {
        boolean t1 = false;
        for (Arbre a : son) {
            if(t1 || a.contient(val)){
                return true;
            };
        }
        return t1;
    }

    @Override
    public Set<Integer> valeurs() {
        Set<Integer> t1 = new HashSet<>();
        for (Arbre a : son) {
            t1.addAll(a.valeurs());
        }
        return null;
    }

    @Override
    public Integer somme() {
        int t1 = 0;
        for (Arbre a : son) {
            t1 += a.somme();
        }
        return t1;
    }

    @Override
    public Integer min() {
        return null;
    }

    @Override
    public Integer max() {
        return null;
    }

    @Override
    public boolean estTrie() {
        return false;
    }
}
