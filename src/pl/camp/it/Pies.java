package pl.camp.it;

public class Pies extends Zwierze {
    public Pies() {
        super(1,2);
    }

    public void szczekaj() {
        System.out.println("Hau hau !!!");
    }

    @Override
    public void merdajOgonem() {
        System.out.println("Myślę !!");
        super.merdajOgonem();
        System.out.println("Merdam jeszcze raz !!");
    }
}
