package podstawyJezykaJava;

import mojPierwszyPakiet.MojaPierwszaKlasainteliJ;

public class PrzykladowaKlasaJava {
    // Pole z importem innej klasy
    private MojaPierwszaKlasainteliJ mojaPierwszaKlasainteliJ;
    // Inne pola
    private int x;
    private int y;

    // Konstruktor domyślny
    public PrzykladowaKlasaJava() {

    }

    // Drugi konstruktor
    public PrzykladowaKlasaJava(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Metody klasy
    private int dodajLiczby(int x, int y) {

        Test test = new Test(); // Użycie innej klasy

        return x + y;
    }

    // Deklaracja klasy w innej klasie
    private class Test {

    }
    // Gettery
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //Settery
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
