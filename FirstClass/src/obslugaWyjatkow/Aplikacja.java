package obslugaWyjatkow;

public class Aplikacja {

    public static void main(String[] args) {

        try {
            nazwiazPolaczenie(-2);
        } catch (NiewlasciwyPort ex) {
            System.out.println(ex.toString());
        }
    }

    public static void nazwiazPolaczenie(int numerPortu) throws NiewlasciwyPort {
        if(numerPortu < 0 ) {
            throw new NiewlasciwyPort("Próba otworzenia portu numer: " + numerPortu);
        } else {
            System.out.println("Port numer: " + numerPortu + " został otworzony");
        }
    }
}


class NiewlasciwyPort extends Exception {

    public NiewlasciwyPort(String opisWyjatku) {
        super(opisWyjatku);
    }
}