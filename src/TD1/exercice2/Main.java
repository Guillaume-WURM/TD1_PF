package TD1.exercice2;

public class Main {
    public static void main(String[] args) {
        Paire<String,Double> p0 = new Paire(1,"un");
        System.out.println(p0.toString());

        Paire p1 = p0.changeFst(1.0);
        System.out.println(p1.toString());


        Paire<Double, Paire> paireChainer = new Paire<>(1.0,p0);
        System.out.println(paireChainer.toString());
    }
}
