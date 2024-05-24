package entities;

import interfaces.Luminoso;
import interfaces.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile, Luminoso {

    private final int durata;
    private int volume;
    private int luminosita;

    public Video(String title, int durata) {
        super(title);
        this.durata = durata;
        this.volume = 50;
        this.luminosita = 50;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getDurata() {
        return durata;
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

    @Override
    public void riproduci() {
        String esclamativo = "!";
        String asterisco = "*";
        for (int i = 0; i < this.durata; i++) {
            System.out.println(super.getTitle() + esclamativo.repeat(this.getVolume()) + asterisco.repeat(this.getLuminosita()));
        }
    }

    @Override
    public void aumentaVolume() {
        if (this.volume == 100) {
            System.out.println("Volume già al massimo!");
        } else setVolume(++volume);
    }

    @Override
    public void diminuisciVolume() {
        if (this.volume > 0) {
            setVolume(--volume);
        } else System.out.println("Volume già al minimo!");
    }
}
