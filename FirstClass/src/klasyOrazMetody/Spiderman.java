package klasyOrazMetody;

public class Spiderman extends Superbohater {

    public Spiderman (int punktyZycia, int sila, int zrecznosc, int wytrzymalosc) {
        super(punktyZycia, sila, zrecznosc, wytrzymalosc);
    }

    public void chodziPoScianach(){
        System.out.println("Chodzi po ścianach");
    }

    public void wystrzelPajeczyne(){
        System.out.println("Pajęczyna wystrzelona");
    }
}
