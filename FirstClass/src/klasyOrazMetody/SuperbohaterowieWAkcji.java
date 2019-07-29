package klasyOrazMetody;

public class SuperbohaterowieWAkcji {

    public static void main(String[] args) {

        Superbohater superbohater = new Superbohater();
        superbohater.setPunktyZycia(100);
        superbohater.setSila(10);
        superbohater.setZrecznosc(20);
        superbohater.setWytrzymalosc(30);

        Batman batman = new Batman(300, 20, 10, 20, true);
        batman.setSila(40);

        Spiderman spiderman = new Spiderman(100, 30, 20, 30);
        spiderman.chodziPoScianach();
        spiderman.setZrecznosc(50);

    }


}
