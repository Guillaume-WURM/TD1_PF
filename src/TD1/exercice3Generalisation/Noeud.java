package TD1.exercice3Generalisation;

import java.util.*;

public class Noeud<T extends Sommable <T> & Comparable<T>> implements Arbre<T> {

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
        T x = son.get(0).min();
        for (Arbre<T> a : son) {
            T valeur = a.min();
            if(x.compareTo(a.min()) > 0){
                x = valeur;
            }
        }
        return x;
    }

    @Override
    public T max() {
        T x = son.get(0).max();
        for(Arbre<T> a : son){
            T valeur = a.max();
            if(x.compareTo(a.min()) < 0){
                x = valeur;
            }
        }
        return x;
    }

    @Override
    public boolean estTrie() {
        boolean x = true;
        for (int i=0; i<son.size(); i++){
            Arbre<T> a = son.get(i);
            if(a.max().compareTo(son.get(i+1).min()) > 0){
                x = false;
            }
            else if (!a.estTrie()){
                return false;
            }
        }
        return x;
    }
}
