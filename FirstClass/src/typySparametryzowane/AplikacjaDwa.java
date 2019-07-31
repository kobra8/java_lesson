package typySparametryzowane;

public class AplikacjaDwa {

    public static void main(String[] args) {

        KlasaGeneryczna<Double, String> klasaGeneryczna = new KlasaGeneryczna(10.0, "Staszek");

        klasaGeneryczna.nazwaTypuGenerycznego();

        double wartosc = klasaGeneryczna.getPoleGeneryczne();

        KlasaGeneryczna<String, Integer> klasaGeneryczna2 = new KlasaGeneryczna("Jan Kowalski", 100);
    }
}
