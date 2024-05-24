package entities;

import interfaces.Luminoso;

public class Immagine extends ElementoMultimediale implements Luminoso {

    private int luminosita;

    public Immagine(String title) {
        super(title);
        this.luminosita = 50;
    }

    public void show() {
        String asterisco = "*";
        System.out.println(super.getTitle() + asterisco.repeat(this.getLuminosita()));
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    @Override
    public void aumentaLuminosita() {
        if (this.luminosita == 100) {
            System.out.println("Luminosità già al massimo!");
        } else this.setLuminosita(++luminosita);
    }

    @Override
    public void diminuisciLuminosita() {
        if (this.luminosita > 0) setLuminosita(--luminosita);
        else System.out.println("Luminosità già al minimo!");
    }
}
