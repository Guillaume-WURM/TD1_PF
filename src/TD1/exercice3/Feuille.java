package TD1.exercice3;

import java.util.Set;

public class Feuille implements Arbre {
    //exercice 3 question 1
    private Integer val;

    public Feuille(Integer val) {
        this.val = val;
    }

    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(Integer val) {
        return val.equals(this.val);
    }

    @Override
    public Set<Integer> valeurs() {
        return Set.of(this.val);
    }

    @Override
    public Integer somme() {
        return this.val;
    }

    @Override
    public Integer min() {
        return this.val;
    }

    @Override
    public Integer max() {
        return this.val;
    }

    @Override
    public boolean estTrie() {
        return true;
    }
}
