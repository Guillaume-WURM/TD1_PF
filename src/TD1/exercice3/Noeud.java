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
        int x = son.get(0).min();
        for (Arbre a : son) {
            if(a.min() < x){
                x = a.min();
            }
        }
        return x;
    }

    @Override
    public Integer max() {
        int x = son.get(0).max();
        for(Arbre a : son){
            if(a.max() > x){
                x = a.max();
            }
        }
        return x;
    }

    @Override
    public boolean estTrie() {
        boolean x = true;
        for (int i = 0; i < son.size() - 1; i++) {
            if(son.get(i).max() > son.get(i+1).min()){
                x = false;
            }
            else if (!son.get(i).estTrie()){
                return false;
            }
        }
        return x;
    }
}
