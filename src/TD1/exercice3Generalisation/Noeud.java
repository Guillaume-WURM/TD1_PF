package TD1.exercice3Generalisation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Noeud<T extends Sommable <T>> implements Arbre<T> {

    public List<Arbre<T>> son;

    public Noeud(List<Arbre<T>> son) {
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
        Iterator<Arbre<T>> element1 = son.iterator();
        T t1 = element1.next().somme();
        T next;
        while (element1.hasNext()) {
            next = element1.next().somme();
            t1 = t1.sommer(next);
        }
        return t1;
    }

    @Override
    public String toString() {
        return "Noeud : [" + "La fils est =" + son + ']';
    }

    @Override
    public T min() {
        //a finir
        /*int x = son.get(0).min();
        for (Arbre a : son) {
            if(a.min() < x){
                x = a.min();
            }
        }
        return x;*/
        return null;
    }

    @Override
    public T max() {
        //a finir
        /*int x = son.get(0).max();
        for(Arbre a : son){
            if(a.max() > x){
                x = a.max();
            }
        }
        return x;*/
        return null;
    }

    @Override
    public boolean estTrie() {
        //a finir
        /*boolean x = true;
        for (T i = 0; i < son.size() - 1; i++) {
            if(son.get(i).max() > son.get(i+1).min()){
                x = false;
            }
            else if (!son.get(i).estTrie()){
                return false;
            }
        }
        return x;*/
        return true;
    }
}
