package entities;

import interfaces.Riproducibile;

public class Audio extends ElementoMultimediale implements Riproducibile {

    private int volume;
    private int durata;

    public Audio(String title) {
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
