package pl.camp.it;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Pies p = new Pies();
        p.setName("Reksio");
        p.setRace("Owczarek");
        p.setChipCode("23546425");

        Kot k = new Kot();
        k.setName("Puszek");
        k.setRace("Rosyjski");
        k.setChipCode("465745367");

        System.out.println(p.getName());
        System.out.println(p.getRace());

        System.out.println(k.getName());
        System.out.println(k.getRace());

        k.merdajOgonem();
        p.merdajOgonem();

        p.szczekaj();
        k.miaucz();

        Pajak pajak = new Pajak();
        pajak.merdajOgonem();
        pajak.tkajSiec();

        Zwierze z = new Pajak();
        z.merdajOgonem();

        Pajak pajak1 = (Pajak) z;
        pajak1.tkajSiec();

        Object o = new Pajak();

        Zwierze z2 = new Kot();

        if(z2 instanceof Object) {
            Object kot = (Object) z2;
        }

        Zwierze[] tab = new Zwierze[3];

        tab[0] = new Kot();
        tab[1] = new Pajak();
        tab[2] = new Pies();

        if(tab[0] instanceof Kot) {
            Kot kot = (Kot) tab[0];
            kot.miaucz();
        }

        if(tab[1] instanceof Pajak) {
            Pajak pajak2 = (Pajak) tab[1];
            pajak2.tkajSiec();
        }

        Zwierze asjhd = new Pajak();

        Pajak asfdgsda = new Pajak();

        Object o1 = new Object();

        Object[] tab1 = new Object[345];

        tab1[0] = "asdfas";
        tab1[1] = new Kot();
        //tab1[2] = new Zwierze();
    }
}
