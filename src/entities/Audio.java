package entities;

import interfaces.Riproducibile;

public class Audio extends ElementoMultimediale implements Riproducibile {

    private final int durata;
    private int volume;

    public Audio(String title, int durata) {
        super(title);
        this.durata = durata;
        this.volume = 50;
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

    @Override
    public void riproduci() {
        String esclamativo = "!";
        for (int i = 0; i < this.durata; i++) {
            System.out.println(super.getTitle() + esclamativo.repeat(this.getVolume()));
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
