package inneTematy;

public enum Superbohater {
    BATMAN(10, "Batmana"), SUPERMAN(5, "Supermana"), WONDER_WOMAN(8, "Wonder woman");

    private int moc;
    private String nazwaDop;

    Superbohater(int moc, String nazwaDop) {
        this.moc = moc;
        this.nazwaDop = nazwaDop;
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public String getNazwaDop() {
        return nazwaDop;
    }

    public void setNazwaDop(String nazwaDop) {
        this.nazwaDop = nazwaDop;
    }
}
