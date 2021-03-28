package pl.camp.it;

public class Main2 {
    public static void main(String[] args) {
        Object[] tab = new Object[3];

        tab[0] = new Kot();
        tab[1] = new Pies();
        tab[2] = new Pajak();

        for(int i = 0; i < tab.length; i++) {
            if(tab[i] instanceof Zwierze) {
                Zwierze z = (Zwierze) tab[i];
                z.merdajOgonem();
            }
        }
    }
}
