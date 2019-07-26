package typyProsteDanychIZmienne;

public class KonwersjaIRzutowanie {

    public static void main(String[] args) {

        // Konwersja automatyczna typów
        int a = 10;
        long b = a;

        // Rzutowanie typów
        double c = 3.999;
        int d = (int) c; // Nie zaokrągla do 4, odetnie dziesiętne i zostaje 3

        System.out.println(c);
        System.out.println(d);
    }
}
