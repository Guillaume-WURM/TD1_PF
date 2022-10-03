package TD1.exercice3Generalisation;

public class Entier <T> implements Sommable<Entier> {

    private Integer val;

    public Entier(Integer val) {
        this.val = val;
    }

    public Integer getVal() {
        return val;
    }

    @Override
    public Entier sommer(Entier val) {
        return new Entier(this.val+ val.getVal());
    }
}
