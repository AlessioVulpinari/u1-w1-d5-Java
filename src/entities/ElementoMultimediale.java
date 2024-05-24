package entities;

public abstract class ElementoMultimediale {
    private String title;

    public ElementoMultimediale(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
