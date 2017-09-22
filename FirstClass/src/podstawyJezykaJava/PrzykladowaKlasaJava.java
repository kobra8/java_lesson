package podstawyJezykaJava;

import mojPierwszyPakiet.MojaPierwszaKlasainteliJ;

public class PrzykladowaKlasaJava {
    private MojaPierwszaKlasainteliJ mojaPierwszaKlasainteliJ;
    private int x;
    private int y;

    public PrzykladowaKlasaJava() {

    }
    public PrzykladowaKlasaJava(int x, int y) {
        this.x = x;
        this.y = y;
    }


    private int dodajLiczby(int x, int y) {

        Test test = new Test();

        return x + y;
    }

    private class Test {

    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
