package pl.camp.it;

public class Zwierze extends Ssak {
    private String name;
    private String race;
    private String chipCode;

    public Zwierze(String a) {
        System.out.println("Konstruktor zwierzecia");
    }

    public Zwierze(int a, int b) {
        //dsfgsdfg
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getChipCode() {
        return chipCode;
    }

    public void setChipCode(String chipCode) {
        this.chipCode = chipCode;
    }

    public void merdajOgonem() {
        System.out.println("Merdam !!");
    }
}
