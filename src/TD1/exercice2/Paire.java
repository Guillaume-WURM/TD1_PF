package TD1.exercice2;

public class Paire<X,Y> {
    public X fst;
    public Y snd;

    public Paire(X x, Y y) {
        this.fst = x;
        this.snd = y;
    }

    public X getFst() {
        return fst;
    }

    public Y getSnd() {
        return snd;
    }

    public String toString() {
        return  "("+ this.fst + ',' + this.snd +")" +
                ":" + "PAIRE" + "[" + this.fst.getClass().getSimpleName()+ ',' + this.snd.getClass().getSimpleName() + "]";
    }

    public <D> Paire<X,Y> changeFst(D fst) {

        return new Paire(fst, this.getSnd());
    }

    public <D> Paire<X,Y> changeSnd(D snd) {
        return new Paire(this.getFst(), snd);

    }
}
