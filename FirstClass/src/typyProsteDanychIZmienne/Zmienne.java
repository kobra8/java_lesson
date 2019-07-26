package typyProsteDanychIZmienne;

public class Zmienne {

    // tworzenie zmiennej: typ identyfikator

    int zmienna = 10; // typ prosty

    String zmienna2 = "Internowanie łańcuchów";

    public static void main(String[] args) {
        // W poniższym przypadku java worzy obiekt String tylko raz potem odwołuje się do stworzonego obiektu
        for (int  i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }

    }
}
