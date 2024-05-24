package entities;

import interfaces.Luminoso;
import interfaces.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile, Luminoso {

    private int volume;
    private int durata;
    private int luminosita;

    public Video(String title) {
        super(title);
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

    public void setDurata(int durata) {
        this.durata = durata;
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
