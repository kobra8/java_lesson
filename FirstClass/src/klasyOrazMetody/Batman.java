package klasyOrazMetody;

public class Batman extends Superbohater {

    boolean batmobil;

    public Batman(int punktyZycia, int sila, int zrecznosc, int wytrzymalosc, boolean batmobil) {
        super(punktyZycia, sila, zrecznosc, wytrzymalosc);
        this.batmobil = batmobil;
    }

    public void uzyjBatmoblilu() {
        if (batmobil) {
            System.out.println("Batmobil użyty");
        } else {
            System.out.println("Batmobli w garażu");
        }
    }
}
