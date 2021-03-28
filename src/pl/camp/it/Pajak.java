package pl.camp.it;

public class Pajak extends Zwierze {

    public Pajak() {
        super("dfg");
        System.out.println("Konstruktor pajaka !!");
    }

    @Override
    public void merdajOgonem() {
        System.out.println("Nie umiem !!");
    }

    public void tkajSiec() {
        System.out.println("Tkam ....");
    }
}
